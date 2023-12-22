import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count=0,a1=a;
        while(a1<=c){
            count+=b;
            a1+=a;
        }
        System.out.println(count);
    }
}