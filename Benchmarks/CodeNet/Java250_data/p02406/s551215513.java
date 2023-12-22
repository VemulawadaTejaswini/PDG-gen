import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
	int n =0;
	int x =0;
	Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=1; i != n+1; i++){
			x = i;
			if(i%3 == 0){
				System.out.print(" "+i);
			}
			else{
				while(x != 0){
					if(x%10 == 3){
						System.out.print(" "+i);
						break;
					}
					else{
						x /= 10;
					}
				}
			}
			
		}
		System.out.println("");
	}
}