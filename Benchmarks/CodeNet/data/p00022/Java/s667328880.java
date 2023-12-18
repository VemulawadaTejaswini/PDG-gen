import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n== 0){
				break;
			}
			int [] data = new int[n];
			data[0] = sc.nextInt();
			for(int i=1; i < n; i++){
				data[i] = data[i-1] + sc.nextInt();
			}
			int ans = data[0];
			for(int i=0; i < n; i++){
				ans = Math.max(ans, data[i]);
			}
			for(int i=1; i < n; i++){
				for(int j=0; j + i < n; j ++){
					int temp = data[j+i] - data[j];
					ans = Math.max(temp, ans);
				}
			}
			System.out.println(ans);
			
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}