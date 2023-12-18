import java.util.Scanner;
public class AOJ0565 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pasta=2000, juice=2000;
		int i;
		for(i=0;i<5;i++){
			if(i<3){
				pasta = Math.min(pasta, sc.nextInt());
			}
			else{
				juice = Math.min(juice, sc.nextInt());
			}
		}
		System.out.println(pasta+juice-50);

	}

}