import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        long height = scan.nextLong();
        long width = scan.nextLong();

        // answer
        if(height == 1 && width > 1){
            System.out.println(width - 2);
        } else if (width == 1 && height > 1){
            System.out.println(height - 2);
        } else if(height == 1 && width == 1){
            System.out.println(1);
        } else {
            System.out.println((height - 2) * (width - 2));
        }


    }
}