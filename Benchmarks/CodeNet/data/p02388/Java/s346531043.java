import java.util.Scanner;
public class Main{
	public void main(String[] args){
		Scanner scan =new Scanner(System.in);
		String x=scan.nextInt();
		if(x<1){x=1;}
		if(x>100){x=100;}
		System.out.println(x*x*x);
	}

}