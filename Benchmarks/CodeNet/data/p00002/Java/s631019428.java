import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br =new  BufferedReader(is);
		while(true){
			String str = br.readLine();
			if(str == null)
				break;
			String str1 = str.substring(0, str.indexOf(" "));
			String str2 = str.substring(str.indexOf(" ")+1);
			int n1 = Integer.parseInt(str1);
			int n2 = Integer.parseInt(str2);
			int count1=0;
			n1 = n1 + n2;
			while(n1 > 0){
				n1 = n1/10;
				count1++;
			}
			System.out.println(count1);
		}
	}

}