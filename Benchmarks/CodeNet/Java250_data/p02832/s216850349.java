import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			list.add(in.nextInt());
		}
		int count = 1;
		int k = 0;
		for(int i=0; i<n; i++){
			if(list.get(i)==count) {
				count+=1;
			}else {
				k+=1;
			}
		}
		if(count ==1) System.out.println("-1");
		else System.out.println(k);
	}
}
