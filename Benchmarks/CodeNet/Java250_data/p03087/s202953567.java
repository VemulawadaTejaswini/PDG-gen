
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int q=scn.nextInt();
		String str=scn.next();
		int []arr=new int[str.length()];
		int ac=0;
		arr[0]=0;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i-1)=='A'&&str.charAt(i)=='C') {
				ac++;
			}
			arr[i]=ac;
		}
		
		for(int i=0;i<q;i++) {
			int l=scn.nextInt();
			int r=scn.nextInt();
			System.out.println(arr[r-1]-arr[l-1]);
		}
		
	}

}
