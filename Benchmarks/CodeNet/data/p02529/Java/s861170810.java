import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<Integer> s = new ArrayList<Integer>();
		ArrayList<Integer> t = new ArrayList<Integer>();
		
		int numS = sc.nextInt();
		for(int i = 0; i < numS; i++){
			setInputs(s);
		}
		
		int numT = sc.nextInt();
		for(int i = 0; i < numT; i++){
			setInputs(t);
		}
		
		System.out.println(printNumSameElements(s, t));
	}
	
	private static void setInputs(ArrayList<Integer> list){
		list.add(sc.nextInt());
	}
	
	public static int printNumSameElements(ArrayList<Integer> s, ArrayList<Integer> t){
		int count = 0;
		for(int i = 0; i < t.size(); i++){
			for(int j = 0; j < s.size(); j++){
				if(t.get(i).intValue() == s.get(j).intValue()){
					count++;
				}
			}
		}
		return count;
	}
}