import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int cnt = 1;cnt <= 5;cnt++){
        	if(sc.nextInt() == 0){
            	System.out.println(cnt);
              	break;
            }
        }
	}
}