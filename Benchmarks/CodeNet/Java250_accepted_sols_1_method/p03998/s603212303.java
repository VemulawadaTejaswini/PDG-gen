import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sa = scanner.next();
        String sb = scanner.next();
        String sc = scanner.next();
        int ia = 0;
        int ib = 0;
        int ic = 0;
        char next = 'a';
        for(int i = 0; i<(sa.length()+sb.length()+sc.length()); i++) {
            if(next=='a') {
                if(ia == sa.length()) {
                    System.out.println("A");
                    return;
                }
                next = sa.charAt(ia);
                ia++;
            }else if(next=='b') {
                if(ib == sb.length()) {
                    System.out.println("B");
                    return;
                }
                next = sb.charAt(ib);
                ib++;
            }else {
                if(ic == sc.length()) {
                    System.out.println("C");
                    return;
                }
                next = sc.charAt(ic);
                ic++;
            }
        }
    }
}