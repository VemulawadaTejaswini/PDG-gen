import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c11=sc.nextInt();
        int c12=sc.nextInt();
        int c13=sc.nextInt();
        int c21=sc.nextInt();
        int c22=sc.nextInt();
        int c23=sc.nextInt();
        int c31=sc.nextInt();
        int c32=sc.nextInt();
        int c33=sc.nextInt();
        int a=c11-c21;
        int b=c12-c22;
        int d=c13-c23;
        int e=c21-c31;
        int f=c22-c32;
        int g=c23-c33;
        if(a==b&b==d&e==f&f==g) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
            

    }

}