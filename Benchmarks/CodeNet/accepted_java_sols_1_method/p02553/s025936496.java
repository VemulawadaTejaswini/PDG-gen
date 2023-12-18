import java.util.*;
public class Main{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=sc.nextInt();
        long d=sc.nextInt();
        long val1=a*c;
        long val2=a*d;
        long val3=b*c;
        long val4=b*d;
        long max=Math.max(Math.max(Math.max(val1,val2),val3),val4);
        System.out.println(max);
        }
    }
