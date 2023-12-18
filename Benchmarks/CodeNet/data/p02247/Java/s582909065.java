import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] str = line.split("");
		String line2 = br.readLine();
		String[] str2 = line2.split("");
		
		for(int i=0;i<=line.length()-line2.length();i++){
			int cnt=0;
			for(int j=0;j<line2.length();j++){
				if(str2[j].equals(str[i+j])){
					cnt++;
				}else continue;
			}
			if(cnt>=line2.length()){
				System.out.println(i);
			}
		}		
	}
}