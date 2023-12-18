import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long Q = scan.nextLong();
        long H = scan.nextLong();
        long S = scan.nextLong();
        long D = scan.nextLong();
        int N = scan.nextInt();

        H = Math.min(H,Q*2);
        S = Math.min(S,H*2);
        D = Math.min(D,S*2);
        System.out.println((N/2)*D + (N%2)*S);


    }
}