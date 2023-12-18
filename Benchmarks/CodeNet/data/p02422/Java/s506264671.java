import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws IOException {

		 BufferedReader br = new BufferedReader(new
		 InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
		StringBuilder moji=new StringBuilder(br.readLine());
		int x = Integer.parseInt(br.readLine());
		for (int i = 0; i < x; i++) {
			Scanner sc=new Scanner(br.readLine());
			String com=sc.next();
			int start=sc.nextInt();
			int end =sc.nextInt();
			if(end==moji.length()-1){
				if(com.equals("print"))System.out.println(moji.substring(start));
				else if (com.equals("replace")){
					moji=moji.replace(start,end+1,sc.next());
					
				}else {
					StringBuilder tmp=new StringBuilder(moji.substring(start));
					moji=moji.replace(start,end+1,tmp.reverse().toString());
					
				}
			}else{
				if(com.equals("print"))System.out.println(moji.substring(start,end+1));
				else if (com.equals("replace")){
					moji=moji.replace(start,end,sc.next());
					
				}else {
					StringBuilder tmp=new StringBuilder(moji.substring(start,end+1));
					moji=moji.replace(start, end+1,tmp.reverse().toString());}
			}sc.close();
		}

	}

}