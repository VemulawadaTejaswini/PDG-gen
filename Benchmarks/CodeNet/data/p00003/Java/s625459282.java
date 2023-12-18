import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x;
            if(a>b && a>c){
                x = a;
                a = c;
                c = x;
            }else if(b>a && b>c){
                x = b;
                b = c;
                c = x;
            }
            if(a*a+b*b == c*c){System.out.println("Yes");}
            else{System.out.println("No");}
        }
        
    }
}
