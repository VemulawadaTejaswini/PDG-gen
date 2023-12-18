import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			long[] num = new long[6];
			int t = 0;
			for(int i = 0;i < 6;i++){
				num[i] = scan.nextLong();
				t += num[i];
			}
			if(t == 0){
				break;
			}
			for(long i = 1,x = 1,y = 1,z = 1;;i++){
				x = x * num[0] % num[1];
				y = y * num[2] % num[3];
				z = z * num[4] % num[5];
				if(x == 1 && y == 1 && z == 1){
					System.out.println(i);
					break;
				}
			}
		}
	}
}