import java.util.Scanner;
public class Main{
	public static void getdata(int[] data){
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < 6 ; i ++){
			data[i]=scan.nextInt();
		}
	}
	public static void print(int[] data){
		int h = data[3]-data[0];
		int m = data[4]-data[1];
		int s = data[5]-data[2];
		if(s < 0){
			m = m - 1;
			s = 60 + s;
		}
		if(m < 0){
			h = h - 1;
			m = 60 + m;
		}
		System.out.println(h+" "+m+" "+s);
	}
	public static void main(String[] args) {
		int[] A = new int[6];
		int[] B = new int[6];
		int[] C = new int[6];
		
		getdata(A);
		print(A);
		getdata(B);
		print(B);
		getdata(C);
		print(C);
	}
}