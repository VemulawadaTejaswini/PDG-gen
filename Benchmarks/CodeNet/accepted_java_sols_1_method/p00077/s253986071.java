import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<String> charLineList = new ArrayList<String>();

		while(stdIn.hasNext()){
			charLineList.add(stdIn.next());
		}
		for(String i:charLineList){
			for(int j = 0;j < i.length();j++){
				if(i.charAt(j) == '@'){
					j++;
					for(int k = 0;k < Integer.parseInt(""+i.charAt(j)); k++){
						System.out.print(i.charAt(j + 1));
					}
					j++;
				}else{
					System.out.print(i.charAt(j));
				}
			}
			System.out.println();
		}
	}
}