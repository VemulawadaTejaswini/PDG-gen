

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigInteger;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
//	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
           Scanner input = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
           
           int [] arr = new int[5];
           for(int i = 0;i < 5;++i)
               arr[i] = input.nextInt();
           int k = input.nextInt();
           boolean flag = false;
           for(int i = 0;i < 5;++i) {
               for(int j = i+1;j < 5;++j){
                   if(arr[j]-arr[i] > k){
                       flag =true;
                       break;
                   }
               }
           }
           if(flag)
               System.out.println(":(");
           else
               System.out.println("Yay!");
	}
}     

