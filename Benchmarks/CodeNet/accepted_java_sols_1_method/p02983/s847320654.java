import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
        int r = sc.nextInt();
        long remain = (long)(2 * Math.pow(10,9)) * 2;
        a:for (long i = l; i < r; i++) {
            for (long j = i + 1; j <= r; j++) {
                if(i*j % 2019 < remain)
                    remain = i*j % 2019;
                if(remain == 0)
                    break a;
            }
        }
		System.out.println(remain);
	}
}