import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class Main{
	public static void main(String[] args){
	int n =0;
	Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(int i=0; i!=n; i++){
			if(i%3 == 0){
				System.out.print(" "+i);
			}
			if(i%10 == 3){
				System.out.print(" "+i);
			}
		}
		System.out.println("");
	}
}