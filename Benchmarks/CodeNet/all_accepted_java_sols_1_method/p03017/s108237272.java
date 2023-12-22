import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		String line = br.readLine();
		if(c < d){// no jump
			String sline = line.substring(a-1, c);
			String cline = line.substring(b-1, d);
			if(sline.matches(".*##.*") || cline.matches(".*##.*")){
				System.out.println("No");
			}
			else{
				System.out.println("Yes");
			}
		}
		else{
			//one jump
			String sline = line.substring(a-1, c);
			String cline = line.substring(b-2, d+1);
			if(sline.matches(".*##.*")){
				System.out.println("No");
			}
			else{
				if(cline.matches(".*\\.\\.\\..*")){
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
		}

	}

}
