import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
		int[] delta=new int[10];
		//int max;
		//int datanum = scan.nextInt();
		
			for(int j=0;j<10;j++){
				delta[j] = scan.nextInt();
				
			}
			Arrays.sort(delta);
			for(int i =delta.length -1;i>delta.length -4;i--){
				System.out.println(delta[i]);
			}
			}
			
			
		}
		
		