import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1000;
        int c = 1;
        while(true){
            if(b*c>=a){
                System.out.println((b*c)-a);
                break;
            }else if(b*c<a){
                c++;
            }
        }
    }
}