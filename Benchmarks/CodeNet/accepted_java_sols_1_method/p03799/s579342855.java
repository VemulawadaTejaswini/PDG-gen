import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		long s = scanner.nextLong();
		long c = scanner.nextLong();
		long count = 0;
		while(true){
			//System.out.println("s="+s+" ,c="+c+" ,count="+count);
			if(s>0 && c>=2){
				long temp = Math.min(s, c/2);
				s = s-temp;
				c = c-(2*temp);
				count += temp;
			}else if(s==0 && c>=4){
				long temp = c/4;
				c = c-temp*2;
				s += temp;
			}else if(s==0 && c>2){
				c = c-2;
				s += 1;
			}else{
				break;
			}
		}
		System.out.println(count);
	}
}