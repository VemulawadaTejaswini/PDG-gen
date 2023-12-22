import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int A=scan.nextInt();
	int B=scan.nextInt();
	int sum,sub,mul=0;
	sum=A+B;
	sub=A-B;
	mul=A*B;
	if(sum>=sub &&(sum>=mul)){
		System.out.println(sum);
	}
	else if(sub>=sum &&(sub>=mul)){
		System.out.println(sub);
	}
	else{
		System.out.println(mul);
	}
	}
}