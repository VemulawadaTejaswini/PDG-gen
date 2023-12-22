import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		try{
			String W=reader.readLine().toLowerCase();
			String text="";

		while(true){
		String p=reader.readLine();
		if(p.equals("END_OF_TEXT"))break;
		text+=" "+p.toLowerCase();
		}


		text=text.replaceAll("\\.", " ");
		text=text.replaceAll("\\n", " ");

		String[] array_text=text.split(" ");
		int count=0;
		for(int i=0;i<array_text.length;i++){
			if(array_text[i].equals(W)){
				count++;
			}
		}

		System.out.println(count);
		//split??§??????.???????????????????????¨?????????????????????????????????


		}catch(IOException e){
			System.out.print(e);
		}
	}

}