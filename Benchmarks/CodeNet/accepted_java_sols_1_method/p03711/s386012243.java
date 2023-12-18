import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
    	int y = sc.nextInt();
	    int[] list = {0,1,2,1,3,1,3,1,1,3,1,3,1};
      
      	if(list[x] == list[y]){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}