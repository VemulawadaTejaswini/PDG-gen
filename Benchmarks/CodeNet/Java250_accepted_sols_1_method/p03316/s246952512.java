import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int num = N;
        int s = 0;
        while(num != 0){
            s += num % 10;
            num /= 10;
            //System.out.println("s:"+s);
            //System.out.println("num:"+num);
        }
        System.out.println(N % s == 0? "Yes":"No");
		

	}

}