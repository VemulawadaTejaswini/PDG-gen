import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b && a>c){
                x = a;
                a = c;
                c = x;
            }else if(b>a && b>c){
                x = b;
                b = c;
                c = x;
            }
            if(a*a+b*b == c*c){System.out.println("YES");}
            else{System.out.println("NO");}
        }
        
    }
}
