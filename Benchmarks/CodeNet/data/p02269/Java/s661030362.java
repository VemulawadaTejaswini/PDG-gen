import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<String> S_A = new ArrayList<String>();
		ArrayList<String> S_C = new ArrayList<String>();
		ArrayList<String> S_G = new ArrayList<String>();
		ArrayList<String> S_T = new ArrayList<String>();

		boolean result = false;
		String str1;
		String str2;
		int tmp = 0;
		StringBuilder answer = new StringBuilder();

		for(int i = 0; i < n; i++){
			str1 = scan.next();
			 str2 = scan.next();

			if(str1.equals("insert")){
				switch(str2.charAt(0)){
					case 'A':
						S_A.add(str2);
						break;
					case 'C':
						S_C.add(str2);
						break;
					case 'G':
						S_G.add(str2);
						break;
					case 'T':
						S_T.add(str2);
						break;
				}
			}else{
				switch(str2.charAt(0)){
				case 'A':
					Collections.sort(S_A);
					result = BinarySearch(S_A, str2);
					break;
				case 'C':
					Collections.sort(S_C);
					result = BinarySearch(S_C, str2);
					break;
				case 'G':
					Collections.sort(S_G);
					result = BinarySearch(S_G, str2);
					break;
				case 'T':
					Collections.sort(S_T);
					result = BinarySearch(S_T, str2);
					break;
				}
				
				if(result){
					answer.append("yes\r\n");
				}else{
					answer.append("no\r\n");
				}
			}
		}
		System.out.print(answer);
	}

	static boolean BinarySearch(ArrayList<String> data, String serch){

		int min = 0;
		int max = data.size() - 1;
		int middle;
		int num;

		while(min <= max){

			middle = (min + max) / 2;
			
			num = serch.compareTo(data.get(middle));

			if(num == 0){
				return true;
			}else if(num < 0){
				max = middle - 1;
			}else{
				min = middle + 1;
			}
		}
		return false;
	}
}