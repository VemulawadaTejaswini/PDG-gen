import java.awt.geom.*;
import java.util.*;
public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int [] array = new int[3];
			for(int i = 0; i < 3; i++){
				array[i] = sc.nextInt();
			}
			if((array[0]|array[1]|array[2]) == 0) break;
			Arrays.sort(array);
			long c = array[0] * array[0] + array[1] * array[1];
			
			int n = sc.nextInt();
			for(int i = 0; i < n; i++){
				long entrance = sc.nextInt();
				if(c < (entrance * 2) * (entrance * 2)){
					System.out.println("OK");
				}
				else{
					System.out.println("NA");
				}
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}