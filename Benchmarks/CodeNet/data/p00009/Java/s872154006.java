import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Integer> prime = new ArrayList<Integer>();
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		try{
			while(true){
				int n = scn.nextInt();
				System.out.println(set_prime(n));
				for(int i = 0;i<prime.size();i++){
					System.out.println(prime.get(i));
				}
				prime.clear();
			}
		}catch(Exception e){

		}
	}

	public static int set_prime(int n){
		for(int i = 2;i<=n;i++){
			for(int j = 1;j < Math.sqrt(i)+1;j++){
				if(i % j == 0 && j != 1)break;
				if(j == (int) Math.sqrt(i))prime.add(i);
			}
		}
		return prime.size();
	}

}