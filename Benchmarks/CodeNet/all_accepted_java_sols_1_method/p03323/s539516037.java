import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(a<=8 && b<=8) {
                	System.out.println("Yay!");
                }
                else {
                	System.out.println(":(");
                }
        }
    }
}