import java.util.Scanner;

class Main{
	public static void main(String[] aegs) {
		Scanner sc=new Scanner(System.in);
		int kaisu=sc.nextInt();
		String moto="";
		int A=0;
		int Un=0;
		boolean checksum=true;
		boolean tp=true;
		for(int i=0; i<kaisu; i++) {
			moto=sc.next();

			if(moto.equals("A")) {
				A++;
			}
			else if(moto.equals("Un")) {
				Un++;
			}

			if(Un>A) {
				checksum=false;
				tp=false;
			}
		}

		if(A==Un && tp==true) {
			checksum=true;
		}
		else if(A!=Un && tp==true) {
			checksum=false;
		}

		if(checksum==true) {
			System.out.println("YES");
		}

		else if(checksum==false) {
			System.out.println("NO");
		}
	}
}
