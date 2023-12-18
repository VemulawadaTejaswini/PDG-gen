import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		int T=0;
		int H=0;
		int b=scan.nextInt();
		for(int j=0;j<b;j++) {
			String str=scan.next();
			String str2=scan.next();
			int g=str.compareTo(str2);
			if(g>0) {
				T+=3;
			}
			else if(g<0){
				H+=3;
			}
			else {
				H++;
				T++;
			}
		}
		System.out.println(T+" "+H);
	}
}
