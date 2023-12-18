import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] l = "11010: :11011:.:11100:,:11101:-:11110:':11111:?:00000:A:00001:B:00010:C:00011:D:00100:E:00101:F:00110:G:00111:H:01000:I:01001:J:01010:K:01011:L:01100:M:01101:N:01110:O:01111:P:10000:Q:10001:R:10010:S:10011:T:10100:U:10101:V:10110:W:10111:X:11000:Y:11001:Z".split(":");
        String[] l2 = "101:010001:000011:10010001:000000:000001:100101:10011010:0101:0001:110:01001:10011011:010000:0111:10011000:0110:00100:10011001:10011110:00101:111:10011111:1000:00110:00111:10011100:10011101:000010:10010010:10010011:10010000".split(":");
        String[] n2 = new String[l2.length];
        String[] n = new String[l.length / 2];
        char[] c = new char[l.length / 2];
        for (int i = 0; i < l.length / 2; i++) {
            n[i] = l[i * 2];
            n2[i] = l2[i];
            c[i] = l[i * 2 + 1].charAt(0);
        }
        while (sc.hasNext()) {
            String t = sc.nextLine();
            String a = "";
            for (char cc : t.toCharArray()) {
                for (int i = 0; i < c.length; i++) {
                    if (cc == c[i]) {
                        a += n[i];
                    }
                }
            }
            int start = 0;
            String r = "";
            boolean f=true;
            while (f) {
                for (int i = 0; i < l2.length; i++) {
                    if(start + l2[i].length()>a.length()) {
                        continue;
                    }
                    if (a.substring(start, start + l2[i].length()).equals(l2[i])) {
                        r += c[i];
                        start += l2[i].length();
                        f=false;
                        break;
                    }
                }
                if(f) {
                    break;
                }else {
                    f=true;
                }
            }
            System.out.println(r);
        }
    }
}


