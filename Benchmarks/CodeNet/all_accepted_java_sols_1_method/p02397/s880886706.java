import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,x;
        while(true){
        a=sc.nextInt();b=sc.nextInt();
        if(a==0 && b==0) break;if(a>b){x=a;a=b;b=x;}
        System.out.printf("%d %d\n",a,b);
        }
    }
}
