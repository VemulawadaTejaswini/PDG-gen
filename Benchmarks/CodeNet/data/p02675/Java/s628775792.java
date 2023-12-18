import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n % 10;
        if(t == 2 || t == 4 || t == 5 || t == 7 || t == 9){
            System.out.println("hon");
        }else if(t == 0 || t == 1 || t == 6 || t == 8){
            System.out.println("pon");
        }else{
            System.out.println("bon");
        }
    }
}