import java.util.Scanner;
public class Main{
	public static void getdata(int[] data){
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < 6 ; i ++){
			data[i]=scan.nextInt();
		}
	}
	public static void print(int[] data){
		
        int come = (data[0]*60+data[1])*60+data[2];
        int out = (data[3]*60+data[4])*60+data[5];
        int last = out-come;
		System.out.println(last/3600+" "+last/60%60+" "+last%60);
	}
	public static void main(String[] args) {
		int[] A = new int[6];
		int[] B = new int[6];
		int[] C = new int[6];
		
		getdata(A);
		getdata(B);
		getdata(C);
		
		print(A);
		print(B);
		print(C);
	}
}