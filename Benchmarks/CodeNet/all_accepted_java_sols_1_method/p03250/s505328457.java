import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int temp;
        if(A>B){temp=A; A=B; B=temp;}
        if(B>C){temp=B; B=C; C=temp;}
        if(A>B){temp=A; A=B; B=temp;}
        System.out.println(C*10+B+A);
    }
}
