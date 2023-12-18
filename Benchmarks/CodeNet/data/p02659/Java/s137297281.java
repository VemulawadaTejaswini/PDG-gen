import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc=new Scanner(System.in);
        long po=sc.nextLong();
        long a=(long)(sc.nextDouble()*100);
        long sum=0;
        sum=(po/100)*a;
        long aa=(po%100)*a;
        System.out.println(sum+aa/100);
    }
}
