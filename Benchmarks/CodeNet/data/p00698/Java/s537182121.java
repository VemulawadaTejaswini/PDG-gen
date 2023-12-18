
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        boolean b = true;
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean first = true;
        while (b) {
            b = runOnce(reader, first);
            first = false;
        }

        reader.close();
    }

    private boolean runOnce(final BufferedReader reader, final boolean first) throws IOException {
        final String[] params = reader.readLine().split(" ");
        final int x = Integer.parseInt(params[0]);
        if (x == 0) return false;
        if(!first) System.out.println();
        final List<String> lines = new ArrayList<>();
        for (int i = 0; i < x + 1; i++) {
            lines.add(reader.readLine());
        }
        reader.readLine();

        final List<Func> funcs = buildFunctions(lines);
        final List<Variable> vars = findVariables(funcs);
        boolean changed = true;
        while (changed && vars.stream().anyMatch(variable -> !variable.defined)) {
            changed = false;
            final ArrayList<Func> tmp = new ArrayList<>(funcs);
            for (final Func func : tmp) {
                if (func.variables.stream().allMatch(variable -> variable.defined)) {
                    funcs.remove(func);
                    continue;
                }
                final List<Variable> collect = func.variables.stream()
                        .filter(variable -> !variable.defined)
                        .collect(Collectors.toList());
                if (collect.size() == 1) {
                    collect.forEach(variable -> {
                        variable.value = func.result - func.variables.stream()
                                .filter(variable1 -> variable1.defined)
                                .map(variable1 -> variable1.value)
                                .reduce(0, (i1, i2) -> i1 + i2);
                        variable.defined = true;
                    });
                    changed = true;
                }
            }
        }
        if (!changed) {
            System.out.println("NO");
            return true;
        }
        vars.forEach(variable -> System.out.println(String.valueOf(variable.value)));
        return true;
    }

    private List<Variable> findVariables(final List<Func> funcs) {
        final List<Variable> set = new ArrayList<>();
        for (final Func func : funcs) {
            for (final Variable variable : func.variables) {
                if (!variable.defined && !set.contains(variable)) {
                    set.add(variable);
                }
            }
        }
        return set;
    }

    private List<Func> buildFunctions(final List<String> lines) {
        final List<Func> funcs = new ArrayList<>();

        for (int i = 0; i < lines.size() - 1; i++) {
            funcs.add(new Func.Builder().fromLine(lines.get(i)));
        }

        final int size = funcs.get(0).variables.size();
        final int funcSize = funcs.size();

        final String[] sums = lines.get(lines.size() - 1).split(" ");

        for (int i = 0; i < size; i++) {
            final Func.Builder builder = new Func.Builder();
            for (int j = 0; j < funcSize; j++) {
                builder.add(funcs.get(j).variables.get(i));
            }
            funcs.add(builder.build(Integer.parseInt(sums[i])));
        }
        return funcs;
    }

}

class Variable {
    Variable(final boolean defined, final int value) {
        this.defined = defined;
        this.value = value;
    }

    boolean defined;
    int value;
}

class Func {
    final int result;
    final List<Variable> variables;

    Func(final List<Variable> variables, final int result) {
        this.result = result;
        this.variables = variables;
    }

    public static class Builder {
        List<Variable> tmp = new ArrayList<>();

        Func fromLine(final String line) {
            final Builder builder = new Builder();
            final List<String> split = new ArrayList<>(Arrays.asList(line.split(" ")));
            final int result = Integer.parseInt(split.remove(split.size() - 1));
            for (final String s : split) {
                if (s.equals("?")) {
                    builder.add(new Variable(false, 0));
                } else {
                    builder.add(new Variable(true, Integer.parseInt(s)));
                }
            }
            return builder.build(result);
        }

        void add(final Variable v) {
            tmp.add(v);
        }

        Func build(final int result) {
            return new Func(tmp, result);
        }
    }
}