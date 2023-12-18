import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main{
	public static void main(String args[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		try{
			while((str = br.readLine()) != null){
				int array[][] = decode(str);

				String result = new String();
				for(int i = 0; i < array.length; i++){
					//System.out.print(array[i][0]);
					//System.out.print(array[i][1]);
					result += outputString(array[i][0], array[i][1]);
				}
				System.out.println(result);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}

	static int[][] decode(String input){
		// とりあえず中間テキストに置き換え
		ArrayList<String> middleArray1 = new ArrayList<String>();
		ArrayList<String> middleArray2 = new ArrayList<String>();
		char now_char = input.charAt(0);
		int char_count = 1;

		for(int i = 1; i < input.length(); i++){
			//System.out.println("charat");
			char pointing_char = input.charAt(i);
			if(now_char == pointing_char){
				char_count++;
			}else{
				//middle_str += now_char;
				middleArray1.add("" + now_char);
				// middle_str += char_count;
				middleArray2.add("" + now_char);
				now_char = pointing_char;
				char_count = 1;
			}
		}
		//middle_str += now_char;
		middleArray1.add("" + now_char);
		// middle_str += char_count;
		middleArray2.add("" + now_char);

		// 中間テキストから配列へ
		int result[][] = new int[middleArray1.size()][2];
		//System.out.println("middle  " + );
		//System.out.println("middle length " + middle_str.length());
		for(int i = 0; i < middleArray1.size(); i++){
			//System.out.println("middle to array " + i);
			result[i][0] = Integer.parseInt(middleArray1.get(i));
			result[i][1] = Integer.parseInt(middleArray2.get(i));
		}
		return result;
	}

	static String outputString(int m, int n){
		String result_str = "";
		switch(m){
		case 1:{
			String strs[] = {"'", ",", ".", "!", "?"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 2:{
			String strs[] = {"a", "b", "c", "A", "B", "C"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 3:{
			String strs[] = {"d", "e", "f", "D", "E", "f"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 4:{
			String strs[] = {"g", "h", "i", "G", "H", "I"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 5:{
			String strs[] = {"j", "k", "l", "J", "K", "L"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 6:{
			String strs[] = {"m", "n", "o", "M", "N", "O"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 7:{
			String strs[] = {"p", "q", "r", "s", "P", "Q", "R", "S"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 8:{
			String strs[] = {"t", "u", "v", "T", "U", "V"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 9:{
			String strs[] = {"w", "x", "y", "z", "W", "X", "Y", "Z"};
			result_str = strs[(n-1) % strs.length];
			break;
		}
		case 0:{
			for(int i = 1; i < n; i++){
				result_str += " ";
			}
		}
		}
		return result_str;
	}
}