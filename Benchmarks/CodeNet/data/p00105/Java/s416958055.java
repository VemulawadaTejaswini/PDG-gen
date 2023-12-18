import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		List<String> pageList = new ArrayList<String>();
		while(stdIn.hasNext()){
			pageList.add(stdIn.nextLine());
		}
		String[] pageArray = pageList.toArray(new String[0]);
		Arrays.sort(pageArray);
		String[] temp = new String[2];
		String sentence = "";
		for(String i:pageArray){
			temp = i.split(" ");
			if(!temp[0].equals(sentence)){
				if(!temp.equals("")){
					System.out.println();
				}
				System.out.println(temp[0]);
				sentence = temp[0];
			}else{
				System.out.print(" ");
			}
			System.out.print(temp[1]);
		}
	}
}