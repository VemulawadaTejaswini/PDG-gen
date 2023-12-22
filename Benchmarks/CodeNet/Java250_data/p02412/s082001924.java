import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		while(true){
			int n = Integer.parseInt(std.next());
			int x = Integer.parseInt(std.next());
			int combo = 0;
			if(n==0 && x==0){
				break;
			}else{
				for(int i=1; i<=n; i++){
					for(int j=i+1; j<=n; j++){
						if(j<x-i-j && x-i-j<=n){
							combo++;
						}
					}
				}
			}
			System.out.println(combo);
		}
	}
}