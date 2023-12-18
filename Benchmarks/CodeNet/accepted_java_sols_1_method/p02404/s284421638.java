import java.util.Scanner;
class Main {
  public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
for(;;) {
	int H=sc.nextInt();
	int W=sc.nextInt();
	if(H==0&&W==0)break;
	else {
		for(int a=0;a<H;a++) {
			for(int s=0;s<W;s++) {
				if(a==0||a==H-1) {
					System.out.print("#");
				}else if(s==0||s==W-1) {
					System.out.print("#");
				}else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}System.out.println();
}
sc.close();
  }
}




