import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int k,count=0;
		while(n != 0 || x != 0){
			for(int i=1; i <= n-2;i++){
				for(int j= i+1; j <= n-1;j++){
					k = x - j - i;
					if(j < k && k <= n){
						count++;
					}
				}
			}
			System.out.println(count);
			count = 0;
			n = sc.nextInt();
			x = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}