import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();

		String target = sc.next();
		setInputsToList(sc, inputs);
		System.out.println(getTargetWords(target, inputs));
	}
	
	public static void setInputsToList(Scanner sc, ArrayList<String> list){
		while(sc.hasNext()){
			String input = sc.next();
			if(input.compareTo("END_OF_TEXT") == 0){
				break;
			}
				list.add(input);
		}
	}
	
	public static int getTargetWords(String target, ArrayList<String> list){
		int count = 0;
		for(int i = 0; i < list.size(); i++){
			if(target.compareTo(list.get(i)) == 0){
				count++;
			}
		}
		return count;
	}
}