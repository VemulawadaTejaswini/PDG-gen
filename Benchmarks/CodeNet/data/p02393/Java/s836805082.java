import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            int n=a;
            a=b;
            b=n;
        }
        if(b>c){
            int n=b;
            b=c;
            c=n;
        }
        if(a>b){
            int n=a;
            a=b;
            b=n;
        }
        System.out.println(a+" "+b+" "+c);
    }
}
