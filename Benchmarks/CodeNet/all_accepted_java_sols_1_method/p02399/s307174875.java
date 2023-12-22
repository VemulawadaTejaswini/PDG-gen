import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.printf(a/b + " " + a%b + " %.10f", (double)a/(double)b);
    }
}
