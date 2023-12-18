import java.util.Scanner;
 
/**
 *
 * @author kke2
 */
public class Main {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int weight  =sc.nextInt();
    int time    =sc.nextInt();
    int i = weight-time;
    if(weight<time){
    i =0;
    }
    System.out.println(i);
    }
}