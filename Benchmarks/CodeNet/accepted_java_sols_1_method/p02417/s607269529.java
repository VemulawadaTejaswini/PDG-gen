import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {

	public static void main(String[] args) throws IOException {

		Character[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int[] sum = new int[ch.length];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;

		while ((str = br.readLine()) !=null) {




		String[] str2 = str.split(" ");

		StringBuilder builder = new StringBuilder();

		List<Character> liststr = new ArrayList<>();

		for (String s : str2) {

			builder.append(s.toLowerCase());
		}
		for (int i = 0; i < builder.length(); i++) {

			liststr.add(builder.charAt(i));
		}

		Collections.sort(liststr);


		for(int i =0; i<ch.length; i++){
			for(int j=0; j<liststr.size(); j++){
				if(ch[i].equals(liststr.get(j))){
					sum[i] +=1;
				}

			}
		}
		}

		for(int i =0; i<ch.length; i++){
			System.out.print(ch[i]+" "+":"+" "+sum[i]+"\n");
		}


	}
}