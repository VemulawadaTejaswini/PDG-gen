/* package whatever; // don't place package name! */
 
import java.util.*;
import java.lang.*;
import java.io.*;
 
import java.util.ArrayList;
import java.util.List;
 
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //文字列読込み
        Scanner sc = new Scanner(System.in);
 
        //結果格納
        int scInt;
        scInt = sc.nextInt();
	
        double price = 100000;

        for (int i = 0; i < scInt; i++){
	price = price * 1.05;
	price = (Math.ceil(price / 1000))*1000;
        }

        System.out.println(Math.round(price));         

    }
}
