import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  ArrayList<Double> StdV = new ArrayList<Double>();

  //n:the number of data
  int i=0,n=0;
  do{
   n=sc.nextInt();
   int j=0;
   int[] data=new int[1000]; //b.c. n<=1000
   //sum:Sum of data,ave:Average of data,V:Dispersion of data,S:Std Deviation of data
   double sum=0,ave=0,pow_sum=0,V=0,S=0;
   for(j=0;j<n;j++){
    data[j]=sc.nextInt();
    sum+=data[j];
   }
   ave=sum/(double)n;
   for(j=0;j<n;j++){
    pow_sum+=(data[j]-ave)*(data[j]-ave);
   }
   V=pow_sum/(double)n;
   //Root of V
   S=Math.sqrt(V);
   StdV.add(i,S);
   i++;
 }while(n!=0); //Repeat until input 0 for the number of data
 //Output excluding 0 data
 for(int k=0;k<i-1;k++){
  System.out.println(StdV.get(k));
   }
 }
}