import java.util.Scanner;

public class LT3H{
 public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  int[] height=new int[100000];
  int h_first=-1;
  int h_second=-1;
  int h_third=-1;
  
  for(int k=0;k<100000;k++){
   height[k]=-1;
  }
  
  (int i=0;sc.nextInt()!=EOF;i++){
   height[i]=sc.nextInt();
   if(h_first<=height[i])
    h_first=height[i];
   else if(h_second<=height[i])
    h_second=height[i];
   else if(h_third<=height[i])
    h_third=height[i];
  }
 
  System.out.println(h_first);
  System.out.println(h_second);
  System.out.println(h_third);
 }
} 