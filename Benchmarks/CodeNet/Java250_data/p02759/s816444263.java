import java.util.Scanner;
 
public class Main {
 
	public static final MyScanner in = new MyScanner();
	public static int[][][][] memo;
 
	public static void main(String[] args) {
 
		int N = in.nextInt();
		int answer = (N/2) + (N%2);
		System.out.println(answer);

	}
 

    public static long comb(int n, int r){
        long num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
 
	public static class MyScanner{
		Scanner sc = new Scanner(System.in);
		String nextLine() {return sc.nextLine();}
		String next() {return sc.next();}
		int nextInt() {return Integer.valueOf(sc.next());}
		long nextLong() { return Long.valueOf(sc.next());}
	}

}