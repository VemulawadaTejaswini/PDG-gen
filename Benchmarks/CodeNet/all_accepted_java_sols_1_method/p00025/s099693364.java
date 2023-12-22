import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args)
			throws java.io.IOException{
		Scanner scan = new Scanner(System.in);
			while(scan.hasNext()){
				int hit =0;
				int blow =0;

				int []a ={scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
				int []b ={scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt()};
				
				for(int i=0;i<4;i++){
					for(int j=0;j<4;j++){
						
						if(i!=j&&a[i]==b[j]){blow++;}
						
					}
					if(a[i]==b[i]){hit++;}
				}
							System.out.println(hit+" "+blow);
	
			}
	}
}