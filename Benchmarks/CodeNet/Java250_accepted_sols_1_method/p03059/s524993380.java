import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), t = sc.nextInt(), ans = 0;
        for(int i=1;i<t+1;i++)if(i%a==0)ans+=b;
        System.out.println(ans);
    }
}