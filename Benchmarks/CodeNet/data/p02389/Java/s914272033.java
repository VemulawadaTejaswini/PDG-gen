import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        
        System.out.print(height*width);
        System.out.print("/b");
        System.out.println(height*2 + width*2);
        
    }
    
}
