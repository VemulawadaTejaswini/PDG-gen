import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int [] a= {0,0,0,0,0,0,0};
	int [] b= {0,0,0,0,0,0,0};
	int A;

public void keisan(){
	for(A=0;A<=7;A++){
		a[A] =sc.nextInt();
		b[A] = sc.nextInt(); 
		System.out.println(a[A]+b[A]);		
	}	
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main main = new Main();
		main.keisan();


	}

}