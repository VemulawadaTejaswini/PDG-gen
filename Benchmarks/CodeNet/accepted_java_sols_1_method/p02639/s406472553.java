import java.util.*;

class Main{
	public static void main(String args[]){
      Scanner in = new Scanner(System.in);  
      for (int i = 1; i <= 5; i++){
        	int val = in.nextInt();
            if (val == 0)
            	System.out.println(i);
        }
    }
}
