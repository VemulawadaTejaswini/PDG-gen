import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
     int p=0;
     for(int i=0;i<K&&p==0;i++){
         if (B<A){B=B*2;}
         else if(C<B){C=C*2;}

         if (B>A&&C>B){p=1;}
     }


if (p==0)System.out.println("No");
        if (p==1)System.out.println("Yes");
}
    }
