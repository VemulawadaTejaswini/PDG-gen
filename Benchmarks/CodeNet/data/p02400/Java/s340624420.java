import java.util.Scanner;
class Main{
	
	Scanner sc = new Scanner(System.in);
	int r;
	double n;
	
	void cp2(){
		r = sc.nextInt();
		System.out.print(n =3.14*r*r);
		System.out.print(" ");
		System.out.println(n =2*3.14*r);
		
	}
		
	public static void main(String[]agrs){
		new Main().cp2();
	}
}