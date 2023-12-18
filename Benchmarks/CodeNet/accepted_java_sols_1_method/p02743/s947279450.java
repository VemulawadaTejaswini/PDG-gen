import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
 
 
        long multi = (long)a * (long)b;
        long right = c - a - b;
      
        if( right > 0 && multi * 4 < (right * right)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
 
        scan.close();
    }
}