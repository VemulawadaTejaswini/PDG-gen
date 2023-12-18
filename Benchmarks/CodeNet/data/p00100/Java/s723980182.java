import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];


		while(!(str=br.readLine()).equals("0")){
			int n = Integer.parseInt(str);
			boolean member[] = new boolean[4001];
			boolean judge=false;
			long re[] = new long[40001];

			for(int i=0; i<n; i++){
				strArray = br.readLine().split(" ");
				int id = Integer.parseInt(strArray[0]);
				long value = Long.parseLong(strArray[1]);
				long much = Long.parseLong(strArray[2]);
				long result = value*much;
				re[id] += result;

				if(re[id] >= 1000000){
					member[id] = true;
					judge=true;
				}
			}
			if(judge){
				for(int i=1; i<member.length; i++){
					if(member[i])
						System.out.println(i);
				}
			}else{
				System.out.println("NA");
			}
		}
	}
}