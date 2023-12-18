import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HashTable {
    final static int M = 1046257;
    String[] table;

    HashTable() {
        table = new String[M];
    }

    int toInt(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
            default:
                return 0;
        }
    }

    int toKey(String s) {
        int sum = 0, p = 1;
        for (char c : s.toCharArray()) {
            sum += p * toInt(c);
            p *= 5;
        }
        return sum;
    }

    int h1(int key) {
        return key % M;
    }

    int h2(int key) {
        return 1 + (key % (M - 1));
    }

    void insert(String s) {
        int key = toKey(s);
        int i = 0;
        while (true) {
            int hash = (h1(key) + i * h2(key)) % M;
            if (table[hash] == null) {
                table[hash] = s;
                break;
            }
            i++;
        }
    }

    String find(String s) {
        int key = toKey(s);
        int i = 0;
        while (true) {
            int hash = (h1(key) + i * h2(key)) % M;
            if (table[hash] == null) {
                return null;
            } else if (table[hash].equals(s)) {
                return table[hash];
            }
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(in.readLine());
            HashTable table = new HashTable();
            String[] line;
            for (int i = 0; i < n; i++) {
                line = in.readLine().split(" ");
                if (line[0].startsWith("i")) {
                    table.insert(line[1]);
                } else if (line[0].startsWith("f")) {
                    String found = table.find(line[1]);
                    if (found == null) {
                        System.out.println("no");
                    } else {
                        System.out.println("yes");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

