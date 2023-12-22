import java.util.ArrayList;
import java.util.Scanner;
//import java.io.*;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		//InputStreamReader is = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(is);
		//String text = scan.next();
		
		int x = 110000;
		ArrayList<Integer> searchList = new ArrayList<Integer>();
		ArrayList<Integer> primeList  = new ArrayList<Integer>();
		for(int i = 2; i <= x; i++) {
			searchList.add(i);
		}
		while(!searchList.isEmpty() && searchList.get(0) <= Math.sqrt(x)) {
			int primeNumber = searchList.get(0);
			primeList.add(primeNumber);
			
			for(int i = 0; i < searchList.size(); i++) {
				if(searchList.get(i) % primeNumber == 0) {
					searchList.remove(i);
					i--;
				}
			}
		}
		primeList.addAll(searchList);
		int[] sum = new int[primeList.size()];
		sum[0] = primeList.get(0);
		for(int i = 1; i < primeList.size(); i++) {
			sum[i] = sum[i-1] + primeList.get(i);
		}
		
		
        int n = scan.nextInt();
        while(n != 0){
            System.out.println(sum[n-1]);
            n = scan.nextInt();
        }
	}
}