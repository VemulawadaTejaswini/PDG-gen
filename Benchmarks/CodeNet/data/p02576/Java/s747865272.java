import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        sc.close();

        System.out.println( t * (int) Math.ceil((double) n / (double) x));
    }
}