import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int[] num = new int[6];
			int t = 0;
			for(int i = 0;i < 6;i++){
				num[i] = scan.nextInt();
				t += num[i];
			}
			if(t == 0){
				break;
			}
			long[] count = new long[3];
			for(int i = 0;i < 6;i+=2){
				t = num[i];
				while(true){
					t %= num[i+1];
					count[i/2]++;
					if(t == 1){
						break;
					}
					t *= num[i];
				}
			}
			long a = count[0]*count[1]/GCD(count[0],count[1]);
			System.out.println(a*count[2]/GCD(a,count[2]));
		}
	}
	
	public static long GCD(long a,long b){
		while(a != 0 && b != 0){
			long t = b;
			b = a;
			a = t % a;
		}
		return (a == 0)?b:a;
	}
}