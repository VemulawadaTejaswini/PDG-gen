import java.util.ArrayList;
import java.util.Scanner;
public class Main  {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = (int)Math.pow(2, n)-1;
		
		int k = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<k; i++) {
			list.add(scan.nextInt());
		}
		

		for(int i=0; i<=m; i++){
			String binary = Integer.toBinaryString(i);
			
			ArrayList<Integer> list2 = new ArrayList<>();
			for(int j=0; j<binary.length();  j++){
				if(binary.charAt(binary.length()-j-1) == '1') list2.add(j);
			}
			
			if(list2.size() >= list.size() && list2.containsAll(list)) {
			System.out.print(i + ":");
			for(int j=0; j<list2.size(); j++) System.out.print(" " + list2.get(j));
			System.out.println();
			}
		}
	}
}
