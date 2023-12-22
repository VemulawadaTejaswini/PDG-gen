import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
      Scanner sc = new Scanner(System.in);
      int x,y;
      x = 1;
      y = 1;
      while(x != 0 || y != 0){
    	x = sc.nextInt();
    	y = sc.nextInt();
    	if((x!=0 || y != 0) && x >= y){
    		System.out.println(y+" "+x);}
    	else if((x!=0 || y != 0) && x < y){
        	System.out.println(x+" "+y);
    	}
      }
	}

}