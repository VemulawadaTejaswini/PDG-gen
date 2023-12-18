import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder bd = new StringBuilder();
        ArrayList<Integer> A = new ArrayList<Integer>();

        while (true) {
            String str = sc.next();
            if (str.equals("0")) {
                for (int i=0; i<A.size(); i++) {
                    System.out.println(A.get(i));
                }
                break;
            }
            else {
                int a = 0;
                for (int i=0; i<str.length(); i++) {
                    a += Integer.valueOf(str.substring(i, i+1));
                }
                A.add(a);
            }
        }
    }
}
