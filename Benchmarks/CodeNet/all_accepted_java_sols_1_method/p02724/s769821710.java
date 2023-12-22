import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();

        int left = x;
        int coin = 0;

        while(true){
        	if(left>=500){
        		left -= 500;
        		coin += 1000;
        	} else if(left>=5){
        		left -= 5;
        		coin += 5;
        	} else{
        		break;
        	}
        }
      	System.out.println(coin);
        sc.close();
    }

}
