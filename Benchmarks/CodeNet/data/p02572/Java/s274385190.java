import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> inputList = new ArrayList<Integer>();
		ArrayList<Long> productList = new ArrayList<Long>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			inputList.add(a);
		}


		for(int j=0;j<inputList.size();j++){
			for(int k=j+1;k<inputList.size();k++){
				productList.add((long)inputList.get(j)*(long)inputList.get(k));
			}
		}
		
		
		long sum = productList.stream().reduce((long)0,(a,b)->a+b);
		
		System.out.println(sum % 1000000007);
	}
}