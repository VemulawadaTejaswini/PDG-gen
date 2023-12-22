import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		char[] list = reader.readLine().toCharArray(); 
		int i = 0;
		int j = n-1;
		int ans = 0;
		while(i<=j){
			if(list[i]=='R'){
				i++;
				continue;
			}
			if(list[j]=='W'){
				j--;
				continue;
			}
			if(i!=j && list[i]=='W' && list[j]=='R'){
				list[i] = 'R';
				list[j] ='W';
				ans++;
				i++;
				j--;
				continue; 
			}
		}
		System.out.println(ans);
	}
}