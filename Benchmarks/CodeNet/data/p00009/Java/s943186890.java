import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static void printAnswer(ArrayList<Integer> list, ArrayList<Integer> answer){
		if(answer.size()>0 && 
				answer.get(answer.size()-1)*answer.get(answer.size()-1)>list.get(list.size()-1)){
			int sum = 0;
			for(int i=0;i<answer.size();i++)
				sum++;
			for(int i=0;i<list.size();i++)
				sum++;
			System.out.println(sum);
		}
		else{
			answer.add(list.get(0));
			for(int i=0;i<list.size();i++){
				if(list.get(i)%answer.get(answer.size()-1)==0){
					list.remove(i);
					i--;
				}
			}
			printAnswer(list, answer);
		}
	}
	
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int a;
		while(scan.hasNext()){
			list.clear();
			a = scan.nextInt();
			for(int i=2;i<=a;i++)
				list.add(i);
			printAnswer(list, answer);
		}
	}
}