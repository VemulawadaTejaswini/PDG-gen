import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int [] data= new int [10];
		for(int i = 0; i < 10; i++){
			int x = sc.nextInt();
			data[i] = x;
		}
		Arrays.sort(data);
		for(int i = 9; i > 6; i--){
			System.out.println(data[i]);
		}
	}
}