import java.io.IOException;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		long count=0;
		while(scan.hasNext()){	
			num= scan.nextInt();
			long s[] = new long[num];
			for(int b=2;b<=num;b++)
				s[b-2]=b;
			for(int i=2;i<Math.sqrt(num);i++){
				for(int j=2;j*i<=num;j++){
					s[i*j-2] = 0;
				}
			}
			for(int i=0;i<num-1;i++){
				if(s[i]!=0)
					count++;
			}
			System.out.println(count);
			count=0;
		}
	}	
}