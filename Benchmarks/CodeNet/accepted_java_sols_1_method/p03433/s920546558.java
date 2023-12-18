import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int one = scan.nextInt();
        int div = total/500;
        int num = total - 500*div;

        if(num <= one){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}