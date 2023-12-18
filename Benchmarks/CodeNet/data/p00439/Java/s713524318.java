import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		while(!(n == 0 && k == 0)){
			int [] list = new int[n];
			list[0] = sc.nextInt();
			for(int i=1; i < n; i++){
				list[i] = list[i-1] + sc.nextInt();
			}
			int max = list[k-1];
			for(int i=1; i + k - 1 < n; i++){
				int result = list[i+k-1] - list[i-1];
				if(result > max){
					max = result;
				}
			}
			System.out.println(max);

			n = sc.nextInt();
			k = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}