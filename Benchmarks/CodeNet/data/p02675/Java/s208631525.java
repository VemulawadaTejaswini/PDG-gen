import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int NLast = N;
		int N3;
		int NumberofDigits = 0;

		for(;;) {
			if(N==0) {
				break;
			}else {
				NumberofDigits++;
				N = N/10;
			}
		}

		for(int i=NumberofDigits;i>1;i--) {
			N3  = (int) (NLast/(Math.pow(10, i-1)));
			NLast = (int) (NLast - N3*(Math.pow(10, i-1)));
		}

		switch(NLast) {
		case 0: System.out.println("pon"); break;
		case 1: System.out.println("pon"); break;
		case 2: System.out.println("hon"); break;
		case 3: System.out.println("bon"); break;
		case 4: System.out.println("hon"); break;
		case 5: System.out.println("hon"); break;
		case 6: System.out.println("pon"); break;
		case 7: System.out.println("hon"); break;
		case 8: System.out.println("pon"); break;
		case 9: System.out.println("hon"); break;
		}
	}
}
