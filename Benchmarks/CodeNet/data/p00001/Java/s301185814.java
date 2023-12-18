
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		int [] array = new int[10];
		for(int i=0; i < 10; i++){
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for(int i= 10-1; i > 10-1-3; i--){
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}