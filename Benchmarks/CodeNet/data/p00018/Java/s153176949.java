
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int [] data = new int[n];
		for(int i=0; i < 5; i++){
			data[i] = sc.nextInt();
		}
		Arrays.sort(data);
		for(int i = 4; i > 0 ;i--){
			System.out.print(data[i] + " ");
		}
		System.out.println(data[0]);
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}