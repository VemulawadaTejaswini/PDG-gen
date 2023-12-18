import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] split = str.split(" ");
        
        int width = Integer.parseInt(split[0]);
        int height = Integer.parseInt(split[1]);
        
        int area = width * height;
        int allLines = (width + height) * 2;
        
        System.out.println(area + " " + allLines);
    }
}