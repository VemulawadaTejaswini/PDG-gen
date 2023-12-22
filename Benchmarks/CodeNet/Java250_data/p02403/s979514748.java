import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int h=stdIn.nextInt();
			int w=stdIn.nextInt();
			if(h==0)
				break;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}