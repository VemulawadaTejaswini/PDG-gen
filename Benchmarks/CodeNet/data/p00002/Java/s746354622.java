import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {	
	public static void main(String args[])throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String Line;
		StringTokenizer st;
		int count;
		
		Line = br.readLine();
		while(!Line.equals("")){
			st  = new StringTokenizer(Line, " ");
			count = 1;
			int num = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			while(num>=10){
				count++;
				num/=10;
			}
			System.out.println(count);
			Line = br.readLine();
		}
	}

}