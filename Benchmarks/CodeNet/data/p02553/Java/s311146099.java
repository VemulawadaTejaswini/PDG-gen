


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
        long ans4=b*c;
        long ans3=a*d;
        System.out.print(Math.max(Math.max(ans1,ans3),Math.max(ans2,ans4)));
    }
}
