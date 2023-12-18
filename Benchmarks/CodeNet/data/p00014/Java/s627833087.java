import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Writer writer = new Writer();
        Reader reader = new Reader();

        MathFunction function = new MathFunction();
        function.add(new Term(1, 2));
        final int minX = 0;
        final int maxX = 600;
        while (reader.isReadable()) {
            final int interval = reader.readInt();

            final int area = (int) Method.calculateArea(function, minX, maxX, interval);
            writer.write(area + "\n");
        }

        writer.print();
    }

}

class Method {

    private Method(){}

    public static double calculateArea(MathFunction function, double minX, double maxX, double intervalX) {
        assert(minX <= maxX);

        double area = 0;
        for (double x = minX; x < maxX; x += intervalX) {
            area += intervalX * function.getValue(x);
        }
        return area;
    }

}

class Term {

    public double coefficient;
    public double power;

    public Term(double coefficient, double power) {
        this.coefficient = coefficient;
        this.power = power;
    }

}

class MathFunction {

    private List<Term> termList;

    public MathFunction() {
        termList = new ArrayList<>();
    }

    public void add(Term term) {
        this.termList.add(term);
    }

    public double getValue(double x) {
        double y = 0;
        for (Term term : this.termList) {
            y += term.coefficient * Math.pow(x, term.power);
        }
        return y;
    }

}

// Not important

class Writer {
    private StringBuilder stringBuilder;
    public Writer() {
        this.stringBuilder = new StringBuilder();
    }
    public <T> void write(T text) {
        this.stringBuilder.append(text);
    }
    public void print() {
        System.out.print(stringBuilder);
    }
}
class Reader {
    private InputStreamReader inputReader;
    private BufferedReader bufferedReader;
    private StringTokenizer tokenizer;
    private String delim;
    public Reader() {
        this.inputReader = new InputStreamReader(System.in);
        this.bufferedReader = new BufferedReader(inputReader);
        this.tokenizer = new StringTokenizer("");
        this.delim = null;
    }
    public void setDelim(String delim) {
        this.delim = delim;
    }
    public boolean isReadable() throws IOException {
        try {
            checkTokenizer();
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
    public Integer readInt() throws IOException {
        final String token = read();
        if (token == null) { return null; }
        return Integer.parseInt(token);
    }
    public Double readDouble() throws IOException {
        final String token = read();
        if (token == null) { return null; }
        return Double.parseDouble(token);
    }
    public String read() throws IOException {
        if (!isReadable()) { return null; }
        if (delim == null) {
            return this.tokenizer.nextToken();
        } else {
            return this.tokenizer.nextToken(delim);
        }
    }
    private void checkTokenizer() throws IOException, NullPointerException {
        if (this.tokenizer.hasMoreTokens()) { return; }
        final String line = this.bufferedReader.readLine();
        this.tokenizer = new StringTokenizer(line);
    }
}