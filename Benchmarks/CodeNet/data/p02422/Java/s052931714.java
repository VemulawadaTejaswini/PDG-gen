import java.io.*;

public class Main{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count = Integer.parseInt(br.readLine());
		for(int i = 0;i<count;i++){
			String str1[] = br.readLine().split(" ");
			int a = Integer.parseInt(str1[1]);
			int b = Integer.parseInt(str1[2])+1;
			if(str1[0].equals("print")) print(a,b,str);
			else if(str1[0].equals("reverse")){ str = reverse(a,b,str);}
			else if(str1[0].equals("replace")){ str = replace(a,b,str1[3],str);}
		}
	}
	
	static void print(int a, int b, String str){
		str = str.substring(a,b);
		System.out.println(str);
	}
	
	static String reverse(int a, int b,String str){
		StringBuffer rev = new StringBuffer(str.substring(a,b));
		String revStr = rev.reverse().toString();
		str = str.substring(0,a) + revStr + str.substring(b,str.length());
		return str;
	}
	
	static String replace(int a, int b, String str2,String str){
		String before = str.substring(0,a);
		String after = str.substring(b,str.length());
		str = before + str2 + after;
		return str;
	}
}