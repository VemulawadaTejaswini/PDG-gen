import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int tmt;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a>b){
            tmt = a;
            a = b;
            b = tmt;
        }
        if(b>c){
            tmt = b;
            b = c;
            c = tmt;
        }
        if(a>b){
            tmt = a;
            a = b;
            b = tmt;
        }
        System.out.printf("%d %d %d\n",a ,b ,c);
    }
}
