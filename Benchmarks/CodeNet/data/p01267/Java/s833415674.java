

import java.util.Scanner;

public class Main {
	private static int n;
	private static int random;
	private static int a, b, c;
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		for(; init(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()); ){
			int count=0;
			int y;
			for(int i=0; i<n; i++){
				y=scanner.nextInt();
				for(; y!=random; next()){
					count++;
					if(10000<count){
						count=-1;
						break;
					}
				}
				next();
				count++;
			}
			System.out.println(count-1);
		}
		
		
		scanner.close();
	}
	private static boolean init(int nextn, int nexta, int nextb, int nextc, int nextx){
		if(nextn==0){
			return false;
		}
		n=nextn;
		a=nexta;
		b=nextb;
		c=nextc;
		random=nextx;
		return true;
	}
	
	private static void next(){
		random=(a*random+b)%c;
	}
	
}