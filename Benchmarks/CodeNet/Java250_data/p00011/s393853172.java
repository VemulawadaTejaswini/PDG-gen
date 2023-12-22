import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		int n = s.nextInt();
		String[] in = new String[2];
		int[] out = new int[w+1];
		int temp;
		for(int i=0 ; i<=w ; i++)
			out[i] = i;
		for(int i=0 ; i<n ; i++){
			in = s.next().split(",");
			temp = out[Integer.parseInt(in[0])];
			out[Integer.parseInt(in[0])] = out[Integer.parseInt(in[1])];
			out[Integer.parseInt(in[1])] = temp;
		}
		for(int i=1 ; i<=w ; i++)
			System.out.println(out[i]);
    }
}