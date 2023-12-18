import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		int start=0; int end=0;
		String moji="";
		String[] nenn;
		int nns=0;
		while(sc.hasNext()) {
			start =sc.nextInt();
			end =sc.nextInt();
			if(start==0 && end==0) {
				System.exit(0);
			}
			for(int i=start; i<=end; i++) {
				if(i%4==0) {
					if(i%400==0) {
						System.out.println(i);
						nns++;
					}
					else if(i%100==0 && i%400 != 0) {

					}
					else {
						System.out.println(i);
						nns++;
					}
				}
				else {}
			}
			if(nns==0) {
				System.out.println("NA");
			}
		}
	}
}
