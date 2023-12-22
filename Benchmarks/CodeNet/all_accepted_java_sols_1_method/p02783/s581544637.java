import java.util.*;
class Main{
	public static void main(String[]args){
    	Scanner in = new Scanner(System.in);
      	int h = in.nextInt();
      	int a = in.nextInt();
      	int i = 0;
        while(h>0){
        	h-=a;i++;
        }
      	System.out.println(i);
    }
}