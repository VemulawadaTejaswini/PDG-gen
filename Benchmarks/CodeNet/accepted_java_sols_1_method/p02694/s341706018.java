import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc=new Scanner(System.in);

		long x=sc.nextLong();
		int i=0;
		double yokin=100;
		
		/*while(yokin<x) {
			yokin=yokin*1.01;
			yokin=Math.floor(yokin); //while文
			
			i++;
		}
		System.out.println(i);*/
		
		for(i=0;yokin<x;i++) {	//for文
			yokin=yokin*1.01;
			yokin=Math.floor(yokin);
		}
		System.out.println(i);
		
		
		sc.close();
	}

}