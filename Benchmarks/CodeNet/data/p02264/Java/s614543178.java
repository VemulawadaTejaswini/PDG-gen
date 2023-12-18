import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		int[] data = new int[n];
		String[] sdata = new String[n];
		int counter = 0;
		for(int i = 0 ; i < n ; i ++){
			str = br.readLine().split(" ");
			sdata[i] = str[0];
			data[i] = Integer.parseInt(str[1]);
		}
		for(int i = 0 ; i < n ; i ++){
			if(data[i]!=0 && data[i]<=q){
				counter+=data[i];
				System.out.println(sdata[i]+" "+counter);
				data[i]=0;
			}
			else if(data[i]!=0 && data[i]>q){
				counter+=q;
				data[i]-=q;
			}
			else{
				if(check(data, n)){
					System.exit(0);
				}
			}
			if(i+1 == n){
				i=-1;
			}
		}
	}
	public static boolean check(int[] data, int n){
		for(int i = 0 ; i < n ; i ++){
			if(data[i]!=0){
				return false;
			}
		}
		return true;	}
}