import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String a = sc.nextLine();
		
		String[] tmp = a.split(" ");
		
		List<Integer> as = new ArrayList<>();
		for(int k = 0; k<tmp.length; k++) {
			as.add(Integer.parseInt(tmp[k]));
		}
		
		int sum = 0;
		for(int i : as) {
			while(true) {
				if(i%2 == 0) {
					i = i/2;
					sum++;
				}
				else
					break;
			}
		}
		System.out.println(sum);
	}
}