import java.util.Scanner;


public class Main {

	int makeRandom(int value){
		return ((value*value)%1000000)/100;
	}
	
	void io(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;++i){
			int initial=s.nextInt();
			System.out.println("Case "+(i+1)+":");
			for(int j=0;j<10;++j){
				initial=makeRandom(initial);
				System.out.println(initial);
			}
		}
		s.close();
	}

	public static void main(String[] args) {
		new Main().io();
	}

}