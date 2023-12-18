import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = sc.nextInt();
		int n = sc.nextInt();
		String[] c = new String[2];
		int f=0;
		int s=0;
		int temp = 0;
		int[] amida = new int[w];
		for(int i = 0 ; i < w ; i ++)
			amida[i]=i+1;
		for(int i = 0 ; i < n ; i ++){
			c=br.readLine().split(",");
			f=Integer.parseInt(c[0]);
			s=Integer.parseInt(c[1]);
			temp=amida[f-1];
			amida[f-1]=amida[s-1];
			amida[s-1]=temp;
		}
		for(int i = 0;i>0;i++){
			System.out.println(amida[i]);
		}
	}
}