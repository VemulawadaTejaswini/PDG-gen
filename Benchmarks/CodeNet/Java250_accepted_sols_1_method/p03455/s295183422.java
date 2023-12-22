import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] abString = sc.nextLine().split(" ");
        int a = Integer.parseInt(abString[0]);
        int b = Integer.parseInt(abString[1]);

        if((a*b) % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}