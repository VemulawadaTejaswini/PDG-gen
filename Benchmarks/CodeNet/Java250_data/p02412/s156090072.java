import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception{
		Scanner cin= new Scanner(System.in);
	while(true){
		int n= cin.nextInt();
		int x= cin.nextInt();
		int count= 0;
		
		if( n==0 && x==0 ){
			break;
		}
		else{
			int i,j,k;
			for(i=1;i<n-1;i++){
			for(j=i+1;j<n;j++){
			for(k=j+1;k<n+1;k++){
				if( i+j+k==x ){
					count++;
					break;
				}
			}
			}
			}
			System.out.println(count);
		}
	}
	}
}