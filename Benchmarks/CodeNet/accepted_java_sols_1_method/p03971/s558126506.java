import java.util.*;
import java.io.*;
public class Main {
public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	String str = br.readLine();
	StringBuilder sb = new StringBuilder();
	int cnt = 0;
	int var = 1;
	for(int i = 0;i < str.length();i++){
		if(str.charAt(i) == 'c')
			sb.append("No");
		else if(cnt < a + b && str.charAt(i) == 'a'){
		    ++cnt;
			sb.append("Yes");
		}
		else if(cnt < a + b && str.charAt(i) == 'b' && var <= b){
			++cnt;
			++var;
			sb.append("Yes");
		}
		else sb.append("No");
		sb.append('\n');
	}
	System.out.print(sb);
}
}