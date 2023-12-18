import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Writer writer = new Writer();
        Reader reader = new Reader();

        Stack<Integer> stack = new Stack<>();
        while (reader.isReadable()) {
            final int index = reader.readInt();

            if (index == 0) {
                writer.write(stack.pop() + "\n");
            } else {
                stack.push(index);
            }
        }

        writer.print();
    }

}

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

    public int readInt() throws IOException {
        return Integer.parseInt(read());
    }

    public double readDouble() throws IOException {
        return Double.parseDouble(read());
    }

    public String read() throws IOException {
        try {
            checkTokenizer();
        } catch (NullPointerException e) {
            return null;
        }

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