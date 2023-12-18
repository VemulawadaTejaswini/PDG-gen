
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    private void run() throws IOException {
        boolean b = true;
        while (b) {
            b = runOnce();
        }
    }

    private boolean runOnce() throws IOException {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String[] params = reader.readLine().split(" ");
        int count = Integer.parseInt(params[0]);
        int length = Integer.parseInt(params[1]);
        if (count == 0 && length == 0) return false;
        final List<Ant> list = new ArrayList<Ant>(count);
        for (int i = 0; i < count; i++) {
            final Ant a = new Ant(reader.readLine().split(" "), i + 1);

            list.add(a);
        }
        exec(list, length);
        reader.close();
        return true;
    }

    private void exec(List<Ant> ants, int length) {
        List<Ant> deleted = new ArrayList<Ant>();
        int count;
        for (count = 0; !ants.isEmpty(); count++) {
            deleted = update(ants, length);
        }
        System.out.println(count + " " + deleted.get(0).index);
    }

    private List<Ant> update(List<Ant> ants, int length) {
        final Map<Integer, Ant> map = new HashMap<Integer, Ant>();
        final ArrayList<Ant> outList = new ArrayList<Ant>();
        final int size = ants.size();
        for (int i = 0; i < size; i++) {
            final Ant ant = ants.get(i);
            ant.position = ant.left ? ant.position - 1 : ant.position + 1;
            if(map.containsKey(ant.position)) {
                final Ant ant1 = map.get(ant.position);
                ant1.left = !ant1.left;
                ant.left = !ant.left;
            }
            map.put(ant.position, ant);
            if(ant.position == 0 || ant.position == length) {
                outList.add(ant);
            }
        }
        for (final Ant ant : outList) {
            ants.remove(ant);
        }
        return outList;
    }

    class Ant {
        int position;
        int index;
        boolean left;

        Ant(final String[] params, int index) {
            this.position = Integer.parseInt(params[1]);
            this.left = params[0].equals("L");
            this.index = index;
        }
    }
}