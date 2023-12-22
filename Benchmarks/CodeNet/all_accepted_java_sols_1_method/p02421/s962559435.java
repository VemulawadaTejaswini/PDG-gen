import java.io.*;

public class Main{
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int a = 0, b = 0;
		for(int i = 0;i<n;i++){
			String str[] = br.readLine().split(" ");
			if(str[0].compareTo(str[1])>0) a+=3;
			else if(str[0].compareTo(str[1])<0) b+=3;
			else if(str[0].compareTo(str[1])==0){
			a++;
			b++;
			}
		}
		System.out.println(a+" "+b);
	}
}