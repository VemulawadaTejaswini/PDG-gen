import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int n;
		int count=1;
		while((n=Integer.parseInt(reader.readLine()))!=0){
				System.out.println("case"+count+":"+n);
				count++;
		}
	}
}
		