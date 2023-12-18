import java.util.Scanner;

class Main
{
    public static void main(String[]args) {
        int H,A,n;
        n=0;
        Scanner sc=new Scanner(System.in);
        H=sc.nextInt();
        A=sc.nextInt();
        
        while(H>0){
            H-=A;
            n++;
        }
        System.out.println(n);
        sc.close();
    }
}