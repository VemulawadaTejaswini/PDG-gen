import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sca=new Scanner(System.in);
		String a=sca.next();

int c=Integer.parseInt(a.substring(5,7));
if(c<=4) {
	System.out.println("Heisei");
}
else {
	System.out.println("TBD");
}
	}

}
