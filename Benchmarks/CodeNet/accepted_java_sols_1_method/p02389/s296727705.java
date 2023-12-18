
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        int area = height*width;
        int lap = height*2 + width*2;
        System.out.println(area +" "+ lap);
        
    }
    
}
