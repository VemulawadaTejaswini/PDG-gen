import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int width = sc.nextInt();
        int height = sc.nextInt();
        
        int area = width * height;
        int allLines = (width + height) * 2;
        
        System.out.println(area + " " + allLines);
    }
}