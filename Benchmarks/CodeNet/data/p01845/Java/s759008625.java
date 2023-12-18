import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int R0,W0,C,R;
		for(R0=sc.nextInt(),W0=sc.nextInt(),C=sc.nextInt(),R=sc.nextInt();R0!=0 || W0!=0 || C!=0 || R!=0;R0=sc.nextInt(),W0=sc.nextInt(),C=sc.nextInt(),R=sc.nextInt()) {
			int flag=0;
			if(R0/W0 >= C) {
				System.out.println("0");
				flag=1;
			}else {
				for(int x = 1;flag==0;x++) {
					if((R0+x*R)/W0 >= C) {
						System.out.println(x);
						flag=1;
					}
				}
			}
			
		}
	}
}

