import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			double s = 0;
			double d = 0;
			while(a != 0){
				int c[] = new int[a];
				for(int b=0;b<a;++b){
					c[b]=sc.nextInt();
					s += c[b];
				}
				s = s/a;
				for(int b=0;b<a;++b){
					d += Math.pow(s-c[b], 2);
				}
				d=Math.sqrt(d/a);
				System.out.println(d);
				d=0;
				s=0;
				a = sc.nextInt();
			}
	}

}