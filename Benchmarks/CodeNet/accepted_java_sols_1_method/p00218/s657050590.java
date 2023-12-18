import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
 for(;;){
	 int n =sc.nextInt();
   if(n==0)break;
 for(int i=0; i<n; i++){
 
 int e=sc.nextInt();
 int m=sc.nextInt();
 int j=sc.nextInt();
 String cl ="C";
 if((e+m)>=180||(e+m+j)>=240||e==100||j==100||m==100)
	 cl ="A";
 else if((e+m+j)>=210||(m>=80&&(e+m+j)>=150)||(e>=80&&(e+m+j)>=150)) 
	 cl="B";
 System.out.println(cl);
 }
 }
 }
 }