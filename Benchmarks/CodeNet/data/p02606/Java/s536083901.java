import java.util.*;

public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int l = Integer.parseInt(sc.next());
      	int r = Integer.parseInt(sc.next());
      	int x = Integer.parseInt(sc.next());
      	int count = 0;
      	for(int cnt = l;cnt < r + 1;cnt++){
			if(cnt % x == 0){
            	count++;
      		}
        }
      	System.out.println(count);
    }
}
