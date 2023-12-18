import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int a=stdIn.nextInt(),b=stdIn.nextInt(),c=stdIn.nextInt(),d=stdIn.nextInt(),e,f,g;
		if(b>a) e=b-a;
		else e=a-b;
		if(c>b) f=c-b;
		else f=b-c;
		if(c>a) g=c-a;
		else g=a-c;
		System.out.print(e<=d&&f<=d||g<=d?"Yes":"No");
	}
}