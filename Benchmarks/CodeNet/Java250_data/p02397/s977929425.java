import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int temp, cnt = 0;
		int x[] = new int[3000], y[] = new int[3000];
		
		while(true){
			x[cnt] = sc.nextInt();
			y[cnt] = sc.nextInt();
			
			if(x[cnt] == 0 && y[cnt] == 0)
				break;
			
			if(x[cnt] > y[cnt]){
				temp = x[cnt];
				x[cnt] = y[cnt];
				y[cnt] = temp;
			}
			
			cnt ++;
		}
		
		for(int i = 0; i < cnt; i++)
			System.out.println(x[i] + " " + y[i]);
	}
}