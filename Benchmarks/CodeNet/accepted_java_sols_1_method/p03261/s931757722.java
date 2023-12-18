import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<String> words = new ArrayList<String>();
		for(int i = 0 ; i < n ; i++){
			words.add(br.readLine());
		}
		
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < i ; j++){
				if(words.get(i).compareTo(words.get(j)) == 0){
					System.out.println("No");
					return;
				}
			}
			if(i > 0){
				int c = words.get(i-1).length() -1;
				if(words.get(i-1).charAt(c) != words.get(i).charAt(0)){
					System.out.println("No");
					return;
				}
			}
		}
		
		System.out.println("Yes");
	}
}
