import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = 1;
		t = Integer.parseInt(reader.readLine());
		int i = 1;
		int rem = 7%t;
		int rem1 = 1%t;
		HashSet<Integer> hs = new HashSet<>();
		while(true){
			if(rem==0){
				System.out.println(i);
				return;
			}
			else if(hs.contains(rem)){
				System.out.println(-1);
				return;
			}
			else{
				hs.add(rem);
				rem1 = (10*rem1)%t;
				rem = (rem + (7*(rem1))%t)%t;
				i++;
			}
		}	
	}
}