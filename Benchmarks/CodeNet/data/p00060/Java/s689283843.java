import java.util.Scanner;


public class Main {
	static Scanner sc;
	static int C1,C2,C3,count;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		new Main();
	}
	
	Main(){
		while (sc.hasNext()) {
			C1 = sc.nextInt();
			C2 = sc.nextInt();
			C3 = sc.nextInt();
			
			for(int i=1; i<=10; i++){
				if(!(i==C1 || i==C2 || i==C3)){
					if(i+C1+C2<=20) count++;
				}
			}
			Print();
		}
	}
	
	void Print(){
		if(count>=4)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}