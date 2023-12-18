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
       switch(s){
       case "North":  
    	   temp=7-dot[0];
    	   dot[0]=dot[1];
    	   dot[1]=temp;
    	   sum+=dot[0];
    	   break;
       case "East":
    	   temp=7-dot[2];
    	   dot[2]=dot[0];
    	   dot[0]=temp;
    	   sum+=dot[0];
    	   break;
       case "West": 
    	   temp=7-dot[0];
    	   dot[0]=dot[2];
    	   dot[2]=temp;
    	   sum+=dot[0];
    	   break;
       case "South":
    	   temp=7-dot[1];
    	   dot[1]=dot[0];
    	   dot[0]=temp;
    	   sum+=dot[0];
    	   break;
       case "Right":
    	   temp=7-dot[1];
    	   dot[1]=dot[2];
    	   dot[2]=temp;
    	   sum+=dot[0];
    	   break;
       case "Left":
    	   temp=7-dot[2];
    	   dot[2]=dot[1];
    	   dot[1]=temp;
    	   sum+=dot[0];
    	   break;
       }
      }
  System.out.println(sum);
  System.out.println();
    }
  }
 }