import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();
        BitSet bitSet = new BitSet(33554432);
        final char[] key = new char[128];
        key['A'] = 0;
        key['C'] = 1;
        key['G'] = 2;
        key['T'] = 3;
        for (int i = 0; i < n; i++) {
            String sp = bf.readLine();
            if (sp.charAt(0) == 'i') {
                int hash = 1;
                for (int j = 7; j < sp.length(); j++) {
                    hash <<= 2;
                    hash+=key[sp.charAt(j)];
                }
                bitSet.set(hash);
            } else {
                int hash = 1;
                for (int j = 5; j < sp.length(); j++) {
                    hash <<= 2;
                    hash+=key[sp.charAt(j)];
                }
                sb.append(bitSet.get(hash) ? "yes\n" : "no\n");
            }
        }
        bf.close();
        System.out.print(sb.toString());
    }
}
