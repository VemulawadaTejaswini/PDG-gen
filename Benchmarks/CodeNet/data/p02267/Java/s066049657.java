import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//????????????????????????
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		//?????????
		int n = Integer.parseInt(bf.readLine());
		String[] sString = bf.readLine().split(" ");
		int q = Integer.parseInt(bf.readLine());
		String[] tString = bf.readLine().split(" ");
	
		int count=0;
		for(int i=0;i<q;i++){
			int num=Integer.parseInt(tString[i]);
			for(int j=0;j<n;j++){
				if(num==Integer.parseInt(sString[j])){
					count++;
				}
			}
		}
		System.out.println(count);
	}
 }