import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int[] delta=new int[5];

		
			for(int j=0;j<5;j++){
				delta[j] = scan.nextInt();	
			}
			Arrays.sort(delta);
			for(int i =delta.length -1;i>=0;i--){
				System.out.print(delta[i]+" " );
			}
		
			}
		}