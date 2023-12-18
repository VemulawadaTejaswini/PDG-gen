import java.util.Scanner;

public class Main{
	public static String solve(int[] line){
		String ans = "YES";
		int[] a = new int[10];
		int[] b = new int[10];
		int indexA = 0;
		int indexB = 0;
		a[0] = line[0];
		for(int i = 1; i < line.length; i++){
			if( line[i] > a[indexA] ){
				indexA++;
				a[indexA] = line[i];
			} else if( b[0] == 0 ){
				b[0] = line[i];
			} else if( line[i] > b[indexB] ){
				indexB++;
				b[indexB] = line[i];
			} else {
				ans = "NO";
				break;
			}
		}
		return ans;
	}
				
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		String[] result = new String[10000];
		int index = 0;
		
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++){
			int[] line = new int[10];
			for(int j = 0; j < 10; j++){
				line[j] = stdIn.nextInt();
			}
			result[index] = solve(line);
			index++;
		}
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}