import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Console {
    static Console instance;
    final BufferedReader reader;

    public static Console getInstance() {
        if (instance == null) {
            instance = new Console();
        }
        return instance;
    }
    
    public Console() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public int readInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public int[] readLineNumbers(int n) throws IOException {
        String[] numStrings = reader.readLine().split(" ");
        int[] result = new int[n];
        for (int i = 0;i < n;i++) {
            result[i] = Integer.parseInt(numStrings[i]);
        }
        return result;
    }
    
    public String[] readLineStrings(int n) throws IOException {
        String[] result = new String[n];
        for (int i = 0;i < n;i++) {
            result[i] = reader.readLine();
        }
        return result;
    }
    
    public void output(int n) {
        System.out.println(n);
    }
    
    public void output(String s) {
        System.out.println(s);
    }
}

class Dictionary {
    String[][] table;
    public Dictionary(int n) {
        int size = n > 8196 ? n / 512 : n;
        table = new String[size][];
    }
    
    public void insert(String value) {
        int hash = Math.abs(value.hashCode()) % table.length;
        if (table[hash] == null) {
            table[hash] = new String[8];
        }
        String[] elems = table[hash];
        int index;
        for (index = 0;index < elems.length;index++) {
            if (elems[index] == null) {
                break;
            }
        }
        if (index == elems.length) {
            String[] newElems = new String[index * 2];
            System.arraycopy(elems, 0, newElems, 0, index);
            elems = newElems;
        }
        elems[index] = value;
    }

    public boolean find(String value) {
        int hash = Math.abs(value.hashCode()) % table.length;
        if (table[hash] == null) {
            return false;
        }
        String[] elems = table[hash];
        for (int i = 0;i < elems.length;i++) {
            if (elems[i] == null) {
                return false;
            } else if (elems[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        int n = Console.getInstance().readInt();
        String[] S = Console.getInstance().readLineStrings(n);
        Dictionary dict = new Dictionary(n);
        for (int i = 0;i < n;i++) {
            String[] op = S[i].split(" ");
            if (op[0].equals("insert")) {
                dict.insert(op[1]);
            } else if (op[0].equals("find")) {
                boolean result = dict.find(op[1]);
                Console.getInstance().output(result ? "yes" : "no");
            } else {
                break;
            }
        }
    }
}