import java.util.Scanner;
import java.time.Year;
import java.util.Random;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String a = sc.next();
        int R = 0;
        if(a.charAt(0)=='R'){
                R++;
        }
        if(a.charAt(1)=='R'){
                R=R+2;
        }
        if(a.charAt(2)=='R'){
            R = R+4;
        }
        
        if(R==1 || R==2|| R==4 || R==5){
            System.out.println(1);
        }else if(R==3 || R == 6){
            System.out.println(2);
        }else if(R==7){
            System.out.println(3);
        }else{
            System.out.println(0);
        }
    }
}