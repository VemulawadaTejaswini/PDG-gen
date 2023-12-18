import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long fig=0;
        long rest = 0;
        long ans = 0;
        fig = n / (a + b);
        ans = a * fig;
        rest = n % (a + b); 


        if(rest<=a){
            ans=ans + rest;
        }
        if(rest>a && rest< a+b){
            ans=ans + a;
        }

        System.out.println(ans);


    }
}