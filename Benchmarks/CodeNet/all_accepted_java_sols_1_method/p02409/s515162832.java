import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int room[][][]=new int[4][3][10];
		int n=stdIn.nextInt();
		for(int i=0;i<n;i++){
			int b=stdIn.nextInt();
			int f=stdIn.nextInt();
			int r=stdIn.nextInt();
			int v=stdIn.nextInt();
			room[b-1][f-1][r-1]+=v;
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<10;k++)
					System.out.print(" "+room[i][j][k]);
				System.out.println("");
			}
			if(i<3)
				System.out.println("####################");
		}
	}
}