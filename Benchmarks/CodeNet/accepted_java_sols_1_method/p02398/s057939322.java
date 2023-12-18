import java.util.*;
public class Main{
	public static void main(String[] args) {
		int a,b,c;
		int count=0;
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		for(int i=a;i<=b;i++){
			if(c%i==0){
				count++;
			}
		}
		System.out.println(count);
	}
}

