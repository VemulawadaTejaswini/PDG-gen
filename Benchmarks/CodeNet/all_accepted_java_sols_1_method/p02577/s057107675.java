import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long n=0;
        long sum=0;
        while (n<s.length()){
            int num=Integer.parseInt(String.valueOf(s.charAt((int) n)));
            sum=sum+num;
            n++;
        }
        if (sum%9==0){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}