
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by YuyaKita on 16/07/13.
 */
public class Main {

    public static void main(String[] args){
        // write your code here
        
            Scanner scan = new Scanner(System.in);
            int x,y,temp;
            x = scan.nextInt();
            y = scan.nextInt();
            if(y>x){
                temp = x;
                x=y;
                y=temp;
            }
            while(y!=0){
                temp = y;
                y = x%y;
                x = temp;
            };
            System.out.println(x);


    }
}