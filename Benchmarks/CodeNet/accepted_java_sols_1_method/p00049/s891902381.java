import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int countA = 0;
		int countB = 0;
		int countAB = 0;
		int countO = 0;
		List<String> bloodList = new ArrayList<String>();
		while(stdIn.hasNext()){
			bloodList.add(stdIn.nextLine());
		}
		for(String i:bloodList){
			String[] temp = i.split(",");
			if("A".equals(temp[1])){
				countA++;
			}else if("B".equals(temp[1])){
				countB++;
			}else if("AB".equals(temp[1])){
				countAB++;
			}else if("O".equals(temp[1])){
				countO++;
			}
		}
		System.out.println(countA + "\n" + countB + "\n" + countAB + "\n" + countO);
	}
}