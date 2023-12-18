public class ITP1_8_D {
    public static void main(String[] args) {

         java.util.Scanner sc = new java.util.Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
         boolean tf = false;
        String x = "";
        for (int i = 0; i < s.length(); i ++) {
            x = "";
            for (int j = 0; j < p.length(); j ++) { x += s.charAt((i + j) % s.length()); }
            if (x.equals(p)) {
                System.out.println("Yes");
                tf = true;
                break;
            }
        }
        if (tf == false) { System.out.println("No"); }
    }
}