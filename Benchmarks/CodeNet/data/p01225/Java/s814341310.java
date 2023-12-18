import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int turn = Integer.parseInt(br.readLine());
		for(int i = 0; i < turn; i++){
			str = br.readLine();
			String[] num = str.split(" ");
			str = br.readLine();
			String[] rgb = str.split(" ");
			if(rgbDivide(num, rgb)){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
	}
	
	static boolean rgbDivide(String[] num, String[] rgb){
		ArrayList<Integer> R = new ArrayList<Integer>();
		ArrayList<Integer> G = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < num.length; i++){
			if(rgb[i].equals("R")){
				R.add(Integer.parseInt(num[i]));
			}else if(rgb[i].equals("G")){
				G.add(Integer.parseInt(num[i]));
			}else{
				B.add(Integer.parseInt(num[i]));
			}
		}
		if(3 <= R.size()){
			Collections.sort(R);
			if(numSearch(R)){
				return true;
			}else{
				return false;	
			}
		}
		if(3 <= G.size()){
			Collections.sort(G);
			if(numSearch(G)){
				return true;
			}else{
				return false;	
			}
		}
		if(3 <= B.size()){
			Collections.sort(B);
			if(numSearch(B)){
				return true;
			}else{
				return false;	
			}
		}
		
		return true;
	}

	private static boolean numSearch(ArrayList<Integer> num) {
		int i = 0;
		if((num.get(i) + 1) == num.get(i+1) &&(num.get(i+1) + 1) == num.get(i+2)){
			return true;
		}else{
			return false;
		}
	}

	
}