/*package whatever //do not write package name here */

import java.util.*;

public class Main {
	public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 String[] arr=new String[n];
      for(int i=0;i<n;i++)
        arr[i]=sc.next();
  int acc=0,wac=0,tlec=0,rec=0;
      for(int i=0;i<n;i++){
      if(arr[i].equals("AC")){
      acc++;
      }
         else if(arr[i].equals("WA")){
         wac++;
         }
            else  if(arr[i].equals("TLE")){
            tlec++;
            }
                 else{
                 rec++;
                 }
         
      
      }
      System.out.println("AC x "+acc);
        System.out.println("WA x "+wac);
        System.out.println("TLE x "+tlec);
        System.out.println("RE x "+rec);
	}
}