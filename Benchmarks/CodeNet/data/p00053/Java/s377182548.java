import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
public class Main {
	Scanner sc = new Scanner(System.in);
	 
	public static void main(String[] args) {
		new Main().AOJ0053();
	}
	
	
	void AOJ0053(){
		ArrayList<Integer> primes = primeTable(100);
		while(true){
			int ans = 0;
			
			int input = sc.nextInt();
			if(input == 0)break;
			
			for(int i = 0; i < input;i++){
				ans += primes.get(i);
			}
			
			System.out.println(ans);
		}
	}
	
	
	
	ArrayList<Integer> primeTable(int n){
		boolean[] table = new boolean[n];
		for(int i = 0; i < table.length; i++){
			table[i] = true;
		}
		
		table[0] = false;
		table[1] = false;
		
		for(int i = 2; i*i < n; i++){
			if(table[i] == false)continue;
			for(int j = i*2; j < n; j += i){
				table[j]=false;
			}
		}
		
		
		ArrayList<Integer> primelist = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			if(table[i] == true)primelist.add(i);
		}
		return primelist;
	}
}