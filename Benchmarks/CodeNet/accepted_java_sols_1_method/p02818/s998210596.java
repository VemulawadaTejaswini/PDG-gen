import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong(),b=sc.nextLong(),k=sc.nextLong();
        System.out.println(Math.max(a-k,0)+" "+Math.max(Math.min(b,b-(k-a)),0));
    }
}
