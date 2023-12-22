import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,count;
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		count=0;
		
		for(int t=a;t<=b;t++) {
			if(c%t==0) {
				count++;
			}
		}System.out.println(count);
    }
}

