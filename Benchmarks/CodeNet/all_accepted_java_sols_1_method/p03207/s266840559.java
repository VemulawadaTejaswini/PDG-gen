import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int goukei=0;
		int max = 0;
		for(int i=0;i<N;i++){
		  int po = sc.nextInt();
		  goukei = goukei+po;
		  if(max<po){
		    max = po;
		  }
		}
		goukei = goukei - (max/2);
		System.out.println(goukei);
	}
}
