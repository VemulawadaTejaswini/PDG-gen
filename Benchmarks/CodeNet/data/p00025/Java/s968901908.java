import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("[^-0-9.]+");
		
		while(scan.hasNext()){
			 int[] Asan = san(scan);
			 int[] Bsan = san(scan);
			 
			 int hits = 0;
			 int blows = 0;
			 
			 for(int i=0;i<10;++i){
				 int a = Asan[i];
				 int b = Bsan[i];
				 
				 if(a>0 && b>0){
					 if(a==b){
						 hits++;
					 }else
					 {
						 blows++;
					 }
				 }
			 }
			 
			 System.out.println(String.format("%d %d", hits, blows));
		}
		
		scan.close();
	}
	
	static int[] san(Scanner s){
		 int[] xsan = new int[10];
		 for(int i=1;i<=4;i++){
			 xsan[s.nextInt()] = i;
		 }
		 return xsan;
	}
}