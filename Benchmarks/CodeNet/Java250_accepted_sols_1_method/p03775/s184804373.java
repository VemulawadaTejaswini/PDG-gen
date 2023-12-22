import java.util.Scanner;

public class Main{
    private static Scanner sc=new Scanner(System.in);
    private static long n=sc.nextLong();
    public static void main(String[] args){
        int sq=(int)(Math.sqrt(n));
        int ans=0;
        for(int i=sq;i>=1;i--){
            if(n%i==0){
                ans=String.valueOf(n/i).length();
                i=0;
            }
        }
        System.out.println(ans);
    }
}