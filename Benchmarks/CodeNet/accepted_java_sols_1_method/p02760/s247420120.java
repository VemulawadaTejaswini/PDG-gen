import java.util.Scanner;
import java.io.*;
class Main{
	public static void main(String[] args) {
		int[] A={0,0,0,0,0,0,0,0,0};
		int[] A2={0,0,0,0,0,0,0,0,0};
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<9;i++){
			A[i]=scan.nextInt();
		}	
		int N;
		int b;
		N=scan.nextInt();
		for(int i=0;i<N;i++){
			b=scan.nextInt();
			for(int j=0;j<9;j++){
				if(b==A[j]){
					A2[j]=1;
				}	
			}
		}
		boolean flag=false;
		for(int i=0;i<3;i++){
			int c=1;
			for(int j=0;j<3;j++){
				c*=A2[i+3*j];
			}
			if(c!=0){
				flag=true;
			}
		}
		for(int i=0;i<3;i++){
			int c=1;
			for(int j=0;j<3;j++){
				c*=A2[3*i+j];
			}
			if(c!=0){
				flag=true;
			}
		}
		if(A2[0]*A2[4]*A2[8]!=0||A2[2]*A2[4]*A2[6]!=0){
			flag=true;
		}
		System.out.println(flag ? "Yes" : "No");
	}
}