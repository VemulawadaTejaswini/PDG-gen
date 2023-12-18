import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader in = new BufferedReader(new FileReader("prob.in"));
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("prob.out")));
		
		
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		long curr = A;
		int count = 0;
		while(curr <= B){
			count++;
			curr = curr * 2;
		}
		
		out.println(count);
		
		
		in.close();
		out.close();
		
	}
}
