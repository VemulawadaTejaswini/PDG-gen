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
			int search = Integer.parseInt(tString[i]);
			int left=0;
			int right = n;
		while(left<right){
			int mid = (left+right)/2;
			if(Integer.parseInt(sString[mid])==search){
				count++;
				break;
			}else if(Integer.parseInt(sString[mid])>search){
				right=mid;
			}else if(Integer.parseInt(sString[mid])<search){
				left= mid+1;
			}
		}
		}
		System.out.println(count);
	}

 }