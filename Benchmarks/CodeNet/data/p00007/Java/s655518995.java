import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int w = sc.nextInt();
		int p = 100000;
		for(int i = 0; i < w; i++){
			if((p*1.05)%1000 > 0){
				p = ((int)(p * 1.05)/1000+1)*1000;
			}else{
				p = (int)(p * 1.05);
			}
		}
		System.out.println(p);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}