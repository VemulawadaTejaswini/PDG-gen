import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10000];
		int cnt = 0, input;
		
		while(true){
			if((input = sc.nextInt()) == 0)
				break;
			num[cnt] = input;
			cnt ++;
		}
		
		for(int i = 0; i < cnt; i++)
			System.out.println("Case " + (i+1) + ": " + num[i]);
	}
}