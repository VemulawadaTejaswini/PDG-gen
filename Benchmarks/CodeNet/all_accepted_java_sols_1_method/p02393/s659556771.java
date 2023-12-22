import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int z;
        if(a>b){
            z=a;
            a=b;
            b=z;
        }
        if(b>c){
            z=b;
            b=c;
            c=z;
        }
        if(a>b){
            z=a;
            a=b;
            b=z;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
