import java.util.*;
import java.lang.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        //金額X
        final long X ;
        //　入れる値
        long tempX=100;

        X = sc.nextLong();

        int i = 0;
        int flag = 0;
        for (; flag == 0; i++) {
            tempX = (long) ( tempX* 1.01);	
            if(tempX>=X){
                flag=1;
            }
        }
		System.out.println(i);
}
}