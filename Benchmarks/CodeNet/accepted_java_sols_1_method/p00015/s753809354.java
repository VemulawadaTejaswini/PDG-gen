import java.math.BigInteger;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String s1=sc.next();
            String s2=sc.next();
            if (s1.length()>80||s2.length()>80) {
                System.out.println("overflow");
                continue;
            }
            BigInteger b=new BigInteger(s1).add(new BigInteger(s2));
            if(b.toString().length()>80){
            	System.out.println("overflow");
            }else{
            	System.out.println(b);
            }
        }
    }
}