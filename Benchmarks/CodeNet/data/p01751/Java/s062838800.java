import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a=sc.nextInt();//起きている時間
			int b=sc.nextInt();//寝ている時間
			int c=sc.nextInt();//到着時間
			int r=0;
			while(r<1440){
				if(c%(a+b)<=a) {
					r+=c%(a+b);
					break;
				}
				r+=60;
			}
			if(r>=1440) r=-1;
			System.out.println(r);

		}
	}
}

