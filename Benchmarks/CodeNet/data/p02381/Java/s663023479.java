import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(true){
			int count = sc.nextInt();
			if(count == 0) {
				break;
			}
			int [] s =new int [count];
			int sum = 0;
			for(int i=0 ; i<count; i++){
				s[i] = sc.nextInt();
				sum += s[i];
			}
			double m = sum/(double)count;
			double a = 0.0;
			for(int i =0; i<count; i++) {
				a +=(s[i]-m)*(s[i]-m);
			}
			a=a/(double)count;
			System.out.println(Math.sqrt(a));
		}
	}
}

