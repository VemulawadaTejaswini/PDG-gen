import java.io.*;
import java.util.*;

class Keyword{
	String str1;
	int count = 0;

	Keyword(String str1){
		this.str1 = str1;
	}
}

class Words{
	String str2;
	static List<Words> sentence = new ArrayList<Words>();

	Words(String str2){
		this.str2 = str2;
	}
}

public class Main{
	public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Keyword x = new Keyword(br.readLine());
	
		while(true){
			String str = br.readLine();
				if(str.equals("END_OF_TEXT")){
					break;
				}
			String[] arr = str.split(" ");

			for(int i = 0; i < arr.length; i++){
				Words.sentence.add(new Words(arr[i]));
			}
		}
		
		for(Words y : Words.sentence){
			if(y.str2.equalsIgnoreCase(x.str1)){
				x.count++;
			}
		}
		System.out.println(x.count);
	}
}