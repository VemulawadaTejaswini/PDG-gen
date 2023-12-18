import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==2){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                int x = a;
                a = b;
                b = x;
            }
            for(int i=1;i<=a;i++){
                if(a%i==0 && b%i==0){System.out.println(i);}
            }
        }else if(n==3){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>b && c>b){
                int x = a;
                a = b;
                b = x;
            }else if(a>c && b>c){
                int x = a;
                a = c;
                c = x;
            }
            for(int i=1;i<=a;i++){
                if(a%i==0 && b%i==0 && c%i==0){System.out.println(i);}
            }
        }
    }
}
