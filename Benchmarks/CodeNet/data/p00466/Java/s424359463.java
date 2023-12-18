import java.util.*;
import java.util.regex.Pattern;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int sum = sc.nextInt();
			if(sum == 0)break ;
			int [] data = new int[9];
			data[0] = sc.nextInt();
			for(int i = 1; i < 9; i++){
				data[i] = data[i-1] + sc.nextInt();
			}
			System.out.println(sum - data[data.length - 1]);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}