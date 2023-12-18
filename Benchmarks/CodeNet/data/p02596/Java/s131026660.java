import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int count = 0;
		long s = 0;
		
		if(k % 2 == 0 || k % 5 == 0){
				System.out.println("-1");
		}else{
			while(true){
				s = (s * 10) + 7;
				count++;
				if(s % k == 0){
					System.out.println(count);
					break;
				}
			}
		}
	}
}