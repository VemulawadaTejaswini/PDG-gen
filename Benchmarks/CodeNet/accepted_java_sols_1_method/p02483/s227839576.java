import java.io.*;
import java.util.*;
class Main{
	public static void main(String[] args) throws IOException{
		int [] Array = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			Array[i] = sc.nextInt();
		}
		Arrays.sort(Array);
		System.out.println(Array[0]+" "+Array[1]+" "+Array[2]);
	}
}