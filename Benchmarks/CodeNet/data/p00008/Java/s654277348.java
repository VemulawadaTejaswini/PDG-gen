import java.util.*;
 
public class Main {
	
	static int N;
	static int[] ary = new int[256];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=9;i++){
			for(int j=0;j<=9;j++){
				for(int k=0;k<=9;k++){
					for(int l=0;l<=9;l++){
						ary[i+j+k+l]++;
					}
				}
			}
		}
		
		while(sc.hasNext()){
			N = sc.nextInt();
			System.out.println(ary[N]);
		}
	}
}