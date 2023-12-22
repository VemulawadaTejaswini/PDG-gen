import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
       Scanner sc=new Scanner(System.in);
       
       String s=sc.next();
       
       int count=s.lastIndexOf("Z")-s.indexOf("A")+1;
       System.out.println(count);
    }
}
