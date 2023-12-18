import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String[] sArray = s.split("");

		LinkedList<String> ansList = new LinkedList<>();

		for(int i = 0; i < s.length(); i++){
			if(sArray[i].equals("1")) {
				ansList.add("1");
			} else if(sArray[i].equals("0")) {
				ansList.add("0");
			} else if(sArray[i].equals("B") && ansList.size() != 0){
				ansList.removeLast();
			}
		}
		
		for(String ans: ansList){
			System.out.print(ans);
		}
	}
}