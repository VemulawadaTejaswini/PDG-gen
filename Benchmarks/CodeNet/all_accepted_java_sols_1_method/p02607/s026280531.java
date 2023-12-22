import java.util.*;

public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(sc.next());
      	int[] list = new int[n];
      	int count = 0;
      	for(int cnt = 0;cnt < list.length;cnt++){
        	list[cnt] = Integer.parseInt(sc.next());
        }
      	for(int cnt = 0;cnt < list.length;cnt += 2){
        	if(list[cnt] % 2 != 0){
				count++;
            }
        }
      	System.out.println(count);
    }
}
