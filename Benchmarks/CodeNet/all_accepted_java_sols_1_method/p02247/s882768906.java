import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
class Main {
  	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int[] x = new int[4];
		LinkedList<Integer> a = new LinkedList<Integer>();
		
		if(str1.indexOf(str2) == -1){
			return;
		}
		if(str1.equals(str2)){
			System.out.println("0");
			return;
		}
		
		
		a.add(str1.indexOf(str2));
		int i = 1;
		while(str1.indexOf(str2, a.get(i - 1) + 1) != -1){
			a.add(str1.indexOf(str2, a.get(i - 1) + 1));
			i++;
		}
		
		for(int j = 0; j < a.size(); j++){
			System.out.println(a.get(j));
		}
	}
}