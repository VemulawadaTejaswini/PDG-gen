import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      String po=sc.next();
      String po2=po.substring(0,n/2);
      String po3=po.substring(n/2);
        System.out.println((po2.equals(po3))?"Yes":"No");
    }
}
