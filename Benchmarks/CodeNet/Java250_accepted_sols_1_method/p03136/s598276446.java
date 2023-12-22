import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.next());
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++){
			arrayList.add(Integer.parseInt(scanner.next()));
		}
		
		int max = arrayList.get(0);
		int index = 0;
		for(int i=1;i<arrayList.size();i++){
			if(max < arrayList.get(i)){
				max = arrayList.get(i);
				index = i;
			}
		}
		arrayList.remove(index);
		
		int total = 0;
		for(int i=0;i<arrayList.size();i++){
			total = total + arrayList.get(i);
		}
		String ans = "";
		if(max < total)
			ans = "Yes";
		else
			ans = "No";
		
		System.out.println(ans);
	}
}