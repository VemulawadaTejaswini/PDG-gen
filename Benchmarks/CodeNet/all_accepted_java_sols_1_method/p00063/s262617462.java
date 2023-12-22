import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<String> wordList = new ArrayList<String>();
		while(stdIn.hasNext()){
			wordList.add(stdIn.next());
		}
		int simmetryCount = 0;
		for(String i:wordList){
			int iDotLength = i.length();
			for(int j = 0;j < iDotLength; j++){
				if(i.charAt(j) != i.charAt(iDotLength -1 - j)){
					break;
				}else if(iDotLength == 1 || i.charAt(j) == i.charAt(iDotLength -1 - j) && j >= iDotLength - 1 - j){
					simmetryCount++;
					break;
				}
			}
		}
		System.out.println(simmetryCount);
	}
}