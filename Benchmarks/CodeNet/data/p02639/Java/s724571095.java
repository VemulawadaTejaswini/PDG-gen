import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int count = 1;
		for(int cnt = 0;cnt < 5;cnt++){
        	if(sc.nextInt() == 0){
            	System.out.println(count);
              	break;
            }
          	count++
        }
	}
}