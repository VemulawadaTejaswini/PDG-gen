import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=stdIn.nextInt();
		for(int i=1;i<=n;i++){
			int x=i;
			if(x%3==0)
				System.out.print(" "+i);
			else{
				while(x!=0){
					if(x%10==3){
						System.out.print(" "+i);
						break;
					}
					x/=10;
				}
			}
		}
		System.out.println("");
	}	
}