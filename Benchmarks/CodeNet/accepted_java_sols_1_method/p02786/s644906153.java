import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long h = sc.nextLong();
		long count = 1;
		boolean flag = true;
		long ans = 0;

		if(h == 1){
			System.out.println("1");
		}else{
			if(!(h%2 == 0)){
				h = h-1;
			}
			while (flag) {
				if(h/2 == 1){
					flag = false;
				}else{
					h = h/2;
					count++;
				}
			}
			long tmp = 1;
			for(int i = 0;i<count;i++){
				ans = tmp*2+1;
				tmp = ans;
			}
	System.out.println(ans);
		}
		}
}