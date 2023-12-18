import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			while(scan.hasNext()){
				int n = scan.nextInt();
				int x = scan.nextInt();
				if((n == 0) && (x == 0))break;
				int counter = 0;
				for(int i = 1; i < n;i++){
					if(i > x)break;
					for(int j = i + 1; j < n; j++){
						if(j + i > x)break;
						int k = x - (j + i);
						if(k == 0){
							counter++;
							break;
						}
					}
				}
				print(String.valueOf(counter));
			}
		}finally{
			scan.close();
		}
	}
	public static void print(String s){
		System.out.println(s);
	}
}