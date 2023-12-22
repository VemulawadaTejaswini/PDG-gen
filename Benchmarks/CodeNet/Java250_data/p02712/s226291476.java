import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        sc.close();
        long M;
        long a = N/3;
        long b = N/5;
        long c = N/15;
        M = (1+N)*N
        -a*(a*3+3)
        -b*(b*5+5)
        +c*(c*15+15);
        M = M/2;

        System.out.print(M);
    }
}