import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         
        for(;;){
        int dot[]= {1,2,3},sum=1,temp,n;
        n=sc.nextInt();
        if(n==0)break;
         for(;n>=0;n--){
        String s=sc.nextLine();
    if(s.equals("North")){
    	   temp=7-dot[0];
    	   dot[0]=dot[1];
    	   dot[1]=temp;
    	   sum+=dot[0];}
    else if(s.equals("East")){
    	   temp=7-dot[2];
    	   dot[2]=dot[0];
    	   dot[0]=temp;
    	   sum+=dot[0];}
    else if(s.equals("West")){
    	   temp=7-dot[0];
    	   dot[0]=dot[2];
    	   dot[2]=temp;
    	   sum+=dot[0];}
    else if(s.equals("South")){
    	   temp=7-dot[1];
    	   dot[1]=dot[0];
    	   dot[0]=temp;
    	   sum+=dot[0];}
    else if(s.equals("Right")){
    	   temp=7-dot[1];
    	   dot[1]=dot[2];
    	   dot[2]=temp;
    	   sum+=dot[0];}
    else if(s.equals("Left")){
    	   temp=7-dot[2];
    	   dot[2]=dot[1];
    	   dot[1]=temp;
    	   sum+=dot[0];
    }
      }
  System.out.println(sum);
    }
  }
 }