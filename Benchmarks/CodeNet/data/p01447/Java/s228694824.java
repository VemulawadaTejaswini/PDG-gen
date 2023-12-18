import java.util.Scanner;

//Earth Invasion Diary of Miyabi-sensei
public class Main{

	int f(int n){
		if(n<=1)return 0;
		if(n<=3)return 1;
		return (n%3==0?f(n/3):f(n/3+1))+1;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println(f(sc.nextInt()));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}