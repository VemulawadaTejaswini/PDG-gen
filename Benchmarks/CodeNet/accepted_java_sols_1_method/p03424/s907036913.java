import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		//StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		boolean f = false;
		for(int i=0;i<n;i++){
			if(sc.next().equals("Y"))
				f = true;
		}
		
		System.out.println(f ? "Four":"Three");
	}
}