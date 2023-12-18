import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		int tmp;
		int p = 0;
		
		while(scanner.hasNext()){
			tmp = scanner.nextInt();
			if(tmp != 0){
				input.add(tmp);
				p++;
			}else{
				System.out.println(input.get(p - 1));
				p--;
			}
		}
	}
}