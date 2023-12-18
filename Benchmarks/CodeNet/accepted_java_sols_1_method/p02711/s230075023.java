import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n =s.nextInt();

        int x=0;

        while(n>0){

            int digit = n%10;
            n=n/10;

            if(digit==7){
                x++;
                break;
            }
        }

        if (x>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}




