import java.util.Arrays;
import java.util.Scanner;

public class Main {      
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            long a=in.nextLong();
            long b=in.nextLong();
            long c=in.nextLong();
            long d=in.nextLong();
            long ar[]=new long[4];
            ar[0]=a*c;
            ar[1]=a*d;
            ar[2]=b*c;
            ar[3]=b*d;
            Arrays.sort(ar);
            
            System.out.println(ar[3]);
            
    }
}
