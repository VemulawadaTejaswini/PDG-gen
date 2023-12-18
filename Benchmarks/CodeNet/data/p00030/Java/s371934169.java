import java.util.*;
//SHAKYO
public class Main {
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			if((n|s) == 0) break;
			int res = s - getS(n);
			if(n == 1){
				System.out.println(1);
			}
			else if(res < 0 || n <= 0){
				System.out.println(0);
			}
			else if(res == 0){
				System.out.println(1);
			}
			else{
				System.out.println(res);
			}
			
		}
	}
	
	private int getS(int n){
		int res = 0;
		for(int i = 1; i < n;i++){
			res += i;
		}
		return res;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}