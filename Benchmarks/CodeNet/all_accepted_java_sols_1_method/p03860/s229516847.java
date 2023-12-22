import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append(B.charAt(0));
        sb.append("C");
        System.out.println(sb.toString());
    }
}
