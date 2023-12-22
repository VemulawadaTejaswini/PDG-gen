import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=1;i<=10;i++){
            b*=n;
            b-=a;
        System.out.println(b);
            
        }
    }
}
