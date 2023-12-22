import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args){
 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> ansList = new ArrayList<>();
		
		String s = sc.next();
		String[] sArray = s.split("");
		
		ansList.add(sArray[0]);
		for(int i = 0; i < N-1; i++) {
			if(!sArray[i].equals(sArray[i+1])) {
				ansList.add(sArray[i+1]);
			}
		}

		System.out.println(ansList.size());
		sc.close();
	}
 
}