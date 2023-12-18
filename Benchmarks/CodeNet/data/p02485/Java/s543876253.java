import java.util.Scanner;
import java.util.ArrayList;  //To use Array List 

public class SumN{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   //ArrayList needn't declare the size of array
  ArrayList<String> N = new ArrayList<String>(); 

  int i=0,j=0;
  String N_tmp;

  //Repeat adding Integer to ArrayN until 0 is added to ArrayN 
  do{
   N_tmp=sc.next();
   N.add(i,N_tmp);
   i++;
  }while(!N.get(i-1).equals("0"));

  //variable for calculation sum of N's each digit
  int sum_N=0;

  //N[0]~N[end]: caluculate sum of each digit
  for(j=0;j<i-1;j++){
   sum_N=0;
   String N_rls = N.get(j);
   int k=0;
   do{
    sum_N+=(int)N_rls.charAt(k)-(int)'0';  //String changes to int
    k++;
   }while(k<N_rls.length());   //length of string

   //Output each the result
   System.out.println(sum_N);
  }
 }
}