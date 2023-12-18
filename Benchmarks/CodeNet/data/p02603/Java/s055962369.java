import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(reader.readLine());
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int money = 1000;
		int stocks = 0;
		int i = 0;
		while(i<n){
		while(i+1<n && list[i]>=list[i+1]) i++;
		if(i==n-1){
			System.out.println(money);
			return;
		}
		stocks = money/list[i];
		money -= stocks*list[i];
		while(i+1<n && list[i+1]>=list[i]) i++;
		if(i==n-1){
			money += stocks*list[i];
			stocks = 0;
			System.out.println(money);
			return;
		}
		money += stocks*list[i];
		stocks = 0;
		}
		System.out.println(money);
	
	}
}