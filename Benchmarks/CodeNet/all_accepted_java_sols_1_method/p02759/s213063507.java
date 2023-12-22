import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        if(n % 2 == 0) System.out.println(n/2);
        else System.out.println((n/2) + 1);
    }
}