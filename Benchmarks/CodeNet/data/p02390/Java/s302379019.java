import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        
        int h = time / 3600;
        time = time % 3600;
        int m = time / 60;
        time = time % 60;
        
        System.out.println(h + ":" + m + ":" + time);
 
    }
 
}
