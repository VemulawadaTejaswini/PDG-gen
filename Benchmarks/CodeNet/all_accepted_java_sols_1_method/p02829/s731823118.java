import java.util.*;
class Main{
	public static void main(String[]args){
    	Scanner in = new Scanner(System.in);
      	int x = in.nextInt(), y = in.nextInt(), z = 0;	
      	if(x==1&&y==2||x==2&&y==1)
          z = 3;
        else if(x==2&&y==3||x==3&&y==2)
       	  z = 1;
      	else if(x==3&&y==1||x==1&&y==3)
          z = 2;
      	System.out.println(z);
    }
} 