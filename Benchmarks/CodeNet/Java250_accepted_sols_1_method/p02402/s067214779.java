import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String numsArray[] = br.readLine().split(" ");
		long sum = 0;
		int max=-1000000;
		int min=1000000;
		int tmp=0;
		for(int i=0; i<num; i++){
			tmp = Integer.parseInt(numsArray[i]);
			if(tmp>max){
				max = tmp;
			}
			if(tmp<min){
				min = tmp;
			}
			sum = sum+tmp;
		}
		System.out.println(min+" "+max+" "+sum);
	}
}