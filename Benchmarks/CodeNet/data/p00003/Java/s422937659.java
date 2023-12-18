package GlobalSign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] a) throws NumberFormatException, IOException{
		int arr[]={0,0,0};
		if(a.length == 0) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int no = Integer.parseInt(br.readLine());
			for(int i=0;i<no;i++) {
				String temp = br.readLine();
				String[] tempArr = temp.split(" ");
				for(int j=0;j<3;j++) {
					arr[j]=Integer.parseInt(tempArr[j]);
				}
				isRightTriangle(arr);
			}
		} else {
			int l = Integer.parseInt(a[0]);
			
			for(int i=1,j=0;i<l*3;i=i+3) {
				arr[j] = Integer.parseInt(a[i]);
				arr[j+1] = Integer.parseInt(a[i+1]);
				arr[j+2] = Integer.parseInt(a[i+2]);
				isRightTriangle(arr);
			}
		}
    }
	
	public static void isRightTriangle(int a[]) {
			int hyp = a[2];
			if(((a[0]*a[0]) + (a[1]*a[1])) == (hyp*hyp)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
	}

}