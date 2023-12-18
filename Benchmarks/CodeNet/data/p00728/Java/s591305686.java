import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  ArrayList<Double> ave=new ArrayList<Double>();
  int i=0,n;
  do{
  int max=1000,min=0,counter_M=0,counter_m=0;
  int sum=0;
  n=sc.nextInt();
  for(int k=0;k<n;k++){
    int s=sc.nextInt();
    sum+=s;
    if(max<=s||counter_M==0){
      max=s;
      counter_M=1;
    }
    if(min>=s||counter_m==0){
      min=s;
      counter_m=1;
    }
  }
  ave.add(i,(double)(sum-max-min)/(double)(n-2));
  i++;
}while(n!=0);
for(int j=0;j<i-1;j++){
  System.out.printf("%.0f\n",ave.get(j));
}
}
}