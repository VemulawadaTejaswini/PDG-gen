


import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a=scan.nextLong();
        long b=scan.nextLong();
        long c=scan.nextLong();
        long d=scan.nextLong();
        long ans1=a*c;
        long ans2=b*d;
        long ans3=a*d;
        if(ans1>ans2){
            System.out.print(Math.max(ans1,ans3));
        }else{
            System.out.print(Math.max(ans2,ans3));
        }
    }
}
