import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int K = Integer.parseInt(reader.readLine());
	String S = reader.readLine();
	int len = S.length();
	if(len<=K){
	System.out.println(S);
	}
	else{
		String h = "";
		for(int i = 0;i<K;i++){
			h+=S.charAt(i);
		}
		h+="...";
		System.out.println(h);
	}
	}
}
