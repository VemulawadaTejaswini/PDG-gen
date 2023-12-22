import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	public static void main(String args[]) throws IOException{
		Scanner bf = new Scanner(System.in);
		int[] list = new int[101];
		for(int i=0; i<101; i++){
			list[i] = 0;
		}
		while(bf.hasNext()){
			list[Integer.parseInt(bf.nextLine())]++;
		}
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int max = 0;
		for(int i=1; i<=100; i++){
			if(list[i] == max) ans.add(i);
			else if(list[i] > max){
				ans.clear();
				max = list[i];
				ans.add(i);
			}
		}
		for(int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}
}