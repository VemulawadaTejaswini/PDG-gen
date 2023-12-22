
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		int a[][]=new int[2][x];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<x;j++) {
				a[i][j]=in.nextInt();
			}
		}
		int b[]=new int[x];
		for(int i=0;i<x;i++) {
			for(int j=0;j<x;j++) {
				if(i==j){
		            b[i]+=(a[0][j]+a[1][j]);
		        }
		        if(i>j){
		            b[i]+=a[0][j];
		        }
		        if(i<j){
		            b[i]+=a[1][j];
		        }
			}
		}
		int max=b[0];
	    for(int i=0;i<x;i++){
	        if(b[i]>max)max=b[i];
	    }
	    System.out.println(max);
	}

}