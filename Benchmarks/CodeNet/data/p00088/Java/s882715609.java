import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p[] = { "101", "000000", "000011", "10010001", "010001", "000001", "100101", "10011010", "0101", "0001", "110", "01001", "10011011", "010000", "0111", "10011000", "0110", "00100", "10011001", "10011110", "00101", "111", "10011111", "1000", "00110", "00111", "10011100", "10011101",
                "000010", "10010010", "10010011", "10010000" };
        String c = " ',-.?ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String q[] = { "11010", "11110", "11100", "11101", "11011", "11111", "00000", "00001", "00010", "00011", "00100", "00101", "00110", "00111", "01000", "01001", "01010", "01011", "01100", "01101", "01110", "01111", "10000", "10001", "10010", "10011", "10100", "10101", "10110", "10111",
                "11000", "11001" };
        while (sc.hasNext()) {
            String result = "";
            char[] s = sc.nextLine().toCharArray();
            for (char t1 : s) {
                for (int i = 0; i < c.length(); i++) {
                    if (t1 == c.charAt(i)) {
                        result += p[i];
                    }
                }
            }
            for (int i = 0; i < result.length() % 5; i++) {
                result += "0";
            }
            String result2 = "";
            for (int i = 0; i < result.length(); i += 5) {
                for (int j = 0; j < q.length; j++) {
                    if (result.substring(i, i + 5).equals(q[j])) {
                        result2 += c.charAt(j);
                    }
                }
            }
            System.out.println(result2);
        }
    }
}

