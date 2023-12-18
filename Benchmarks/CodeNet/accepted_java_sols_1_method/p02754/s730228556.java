import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
      	//System.out.println(N);
      	//System.out.println(A);
        //System.out.println(B);
        long a = N/(A+B);
        long b = N%(A+B);
        //System.out.println(a +""+ b);
        if(b > A){
            System.out.print(A*a+A);
        }else{
            System.out.print(A*a+b);
        }
    }
}