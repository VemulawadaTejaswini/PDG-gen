import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new
				BufferedReader(new InputStreamReader(System.in));
		while(true){
			String str1 = br.readLine();
			if(str1==null)break;
			int total=0;
			int num1 = Integer.parseInt(str1);
			for(int i=0;i<600;i+=num1){
				total+=(i*i*num1);
			}
			System.out.println(total);
		}

	}

}