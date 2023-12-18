import java.util.Scanner;
import java.util.*;
import java.io.*;

    public class Main {
        public static void main(String args[]) {
          
     
            Scanner scan = new Scanner(System.in);
     
            int n=scan.nextInt();
          int p=0;
          int []a=new int[n];
          for(int i=0;i<n;i++)
          {
            a[i]=scan.nextInt();
            if(a[i]==0)
              p=i+1;
          }
         
                   
     
            System.out.println(p);
        }
    }

