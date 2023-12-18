

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char [] arr = new char[1200];
        int [] ascii = new int [1200];
        arr = text.toCharArray();
        for (int i = 0; i <arr.length; i++)
        {
           ascii[i] =(int)arr[i];
           if(65<=ascii[i] && ascii[i]<=90)
           {
               ascii[i] = ascii[i] + 32; 
           }
           else if (97<=ascii[i] && ascii[i]<=122)
           {
               ascii[i] = ascii[i]-32;
           }
            arr[i] = (char)ascii[i];
            System.out.print(arr[i]);
        }
        System.out.println();
        

       
    
    
    
    
    }
}

