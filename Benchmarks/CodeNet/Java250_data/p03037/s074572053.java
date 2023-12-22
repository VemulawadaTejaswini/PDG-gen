
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int [][]arr=new int[m][2];
		for(int i=0;i<m;i++) {
			arr[i][0]=scn.nextInt();
			arr[i][1]=scn.nextInt();
		}
		
		int left=arr[0][0],right=arr[0][1];
		for(int i=1;i<m;i++) {
			if(arr[i][1]<left||arr[i][0]>right) {
				System.out.println(0);
				return;
			}else {
					if(right<=arr[i][1]) {
						if(left<arr[i][0])
						left=arr[i][0];
					}else if(right>arr[i][1]){
						right=arr[i][1];
						if(arr[i][0]>left)
							left=arr[i][0];
					}
			
			}
		}
		System.out.println(right-left+1);
	}

}
