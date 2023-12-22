import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
      	int y = sc.nextInt();
      	int num = 0;
      	for(int cnt = x * 2;cnt >= 0;cnt -= 2){
        	if(cnt + num == y){
            	System.out.println("Yes");
              	System.exit(0);
            }
          	num += 4;
        }
      	System.out.println("No");
	}
}