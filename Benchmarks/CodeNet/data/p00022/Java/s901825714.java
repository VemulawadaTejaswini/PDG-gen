import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args)throws IOException{
		Scanner scan = null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				int n = scan.nextInt();
				if(n == 0)break;
				int max;
				List<Integer> dataset = new ArrayList<Integer>();
				dataset.add(max = scan.nextInt());
				for(int i = 1;i<n;i++)
					dataset.add(max = scan.nextInt());
				for(int i = 0; i < n; i++){
					int sum = 0;
					for(int j = i; j<n;j++){
						max = Math.max(sum += dataset.get(j), max);
					}
				}
				System.out.println(max);
			}
		}finally{
			scan.close();
		}

	}
}