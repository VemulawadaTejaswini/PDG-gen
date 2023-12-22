import java.util.Scanner;
/**
 * Write a description of class Homework here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int vacation = sc.nextInt();
        
        int assignments = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < assignments; i++){
            int assign = sc.nextInt();
            
            sum += assign;
            
        }
        
        if(sum > vacation) {
            System.out.println("-1");
        } else {
            System.out.println(vacation - sum);
        }

    }
}