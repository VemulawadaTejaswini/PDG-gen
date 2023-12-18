import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				break;
			}

			writeNumbers("", n, n);
		}
	}

//	static ArrayList<Integer> makeList(int num){
//		if(num == 1){
//			ArrayList<Integer> list = new ArrayList<Integer>();
//			list.add(1);
//			return list;
//		}
//
//		else {
//			for(int i = num ; i >= 1 ; i++){
//				ArrayList<Integer> subList = makeList(num - 1);
//			}
//		}
//	}

	static void writeNumbers(String str, int n, int prev){
		//System.out.println("n = "+n);
		
		for(int i = n; i >= 1 ; i--){
			String[] tmpArray = str.split(" ");
			if(i == n && i <= prev){
				System.out.println(str + n);
			}
			else if(i <= prev){
				//System.out.print(str + " " + i + " ");
				if(str.equals("")){
					writeNumbers(i+" ", n - i, i);
				}
				else {
					writeNumbers(str + i+ " ",  n - i, i);
				}
			}
		}
	}

}