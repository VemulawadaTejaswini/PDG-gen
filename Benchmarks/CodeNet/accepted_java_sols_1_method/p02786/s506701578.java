import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long a=sc.nextLong();
        int count=0;
        for(int i=0;i<=100;i++){
            a=a/2;
            count++;
            if(a==0)
                break;
        }
        long m=(long)Math.pow(2,count)-1;
        System.out.println(m);
    }
}