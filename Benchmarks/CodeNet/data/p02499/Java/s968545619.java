import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String str = br.readLine();
		int i;
		int count[]=new int['z'+1];
		char cha;
		for(i='a';i<='z';i++){
			count[i]=0;
		}
		for(i=0;i<str.length();i++){
			cha = str.charAt(i);
			count[cha]++;
		}
		for(i='a';i<='y';i++){
			System.out.printf("%c : %d\n",i,count[i]);
		}
		System.out.printf("z : %d\n",count['z']);
	}
}