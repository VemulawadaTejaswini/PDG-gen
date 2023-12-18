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
        int[] check  = new int[3];

        while (sc.hasNext()) {
            //1行読込み
            scInt = sc.nextInt();
	
	if (check[0] < scInt) {
		check[2] = check[1];
		check[1] = check[0];
		check[0] = scInt;
	} else if (check[1] < scInt) {
		check[2] = check[1];
		check[1] = scInt;
	} else if (check[2] < scInt) {
		check[2] = scInt;
	} else {
	}
        }

	System.out.println(check[0]);         
	System.out.println(check[1]);         
	System.out.println(check[2]);         

    }
}
