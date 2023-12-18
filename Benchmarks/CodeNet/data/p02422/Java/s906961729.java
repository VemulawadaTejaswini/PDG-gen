import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    private String str;
    
    public Main(String str) {
        this.str = str;
    }
    
    public static void main(String[] args) {
        Main obj = new Main(scn.next());
        int lim = scn.nextInt();
        for(int i = 0; i < lim; i++) {
            switch(scn.next()) {
              case "print":
                obj.print(scn.nextInt(), scn.nextInt() + 1);
                break;
              case "reverse":
                obj.reverse(scn.nextInt(), scn.nextInt() + 1);
                break;
              case "replace":
                obj.replace(scn.nextInt(), scn.nextInt() + 1, scn.next());
                break;
            }
        }
    }
    
    public void print(int a, int b) {
        System.out.println(str.substring(a, b));
    }
    
    public void reverse(int a, int b) {
        String pre = str.substring(0, a);
        String suf = str.substring(b);
        StringBuilder sb = new StringBuilder(str.substring(a, b));
        str = pre + sb.reverse().toString() + suf;
    }
    
    public void replace(int a, int b, String ptn) {
        String pre = str.substring(0, a);
        String suf = str.substring(b);
        str = pre + ptn + suf;
    }
}