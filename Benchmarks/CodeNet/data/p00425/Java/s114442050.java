import java.util.*;
 
public class Main {
	Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		new Main();	
	}
 
	public Main() {
		new A().doIt();
	}
	class A{
		void swap(int a,int b,int c,int d,int dice[]){
			int result = dice[a];
			dice[a] = dice[b];
			dice[b] = dice[c];
			dice[c] = dice[d];
			dice[d] = result;
		}
		int top(String str,int dice[]){
			if(str.equals("North"))swap(0,1,2,3,dice);
			else if(str.equals("South"))swap(0,3,2,1,dice);
			else if(str.equals("East"))swap(1,4,3,5,dice);
			else if(str.equals("West"))swap(1,5,3,4,dice);
			else if(str.equals("Right"))swap(2,5,0,4,dice);
			else swap(2,4,0,5,dice);
			return dice[1];
		}
		void doIt(){
			while(true){
				int dice[] = {5,1,2,6,4,3};
				int n = sc.nextInt();
				if(n == 0)break;
				int ans = 1;
				for(int i = 0;i < n;i++){
					String str = sc.next();
					ans = ans + top(str,dice);
				}
				System.out.println(ans);
			}
		}
	}
}