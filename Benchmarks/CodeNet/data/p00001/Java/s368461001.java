import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  int[] height=new int[100000];
  int h_first=-1;
  int h_second=-1;
  int h_third=-1;
  
  for(int k=0;k<100000;k++){
   height[k]=-1;
  }
  
  for(int i=0;i<100000;i++){
   height[i]=sc.nextInt();
   if(h_first<=height)
    h_first=height[i];
   else if(h_second<=height[i])
    h_second=height[i];
   else if(h_third<=height[i])
    h_third=height[i];
  }
 
  System.out.println(height_first);
  System.out.println(height_second);
  System.out.println(height_third);
 }
} 
  