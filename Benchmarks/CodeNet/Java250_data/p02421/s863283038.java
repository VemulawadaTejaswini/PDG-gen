import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int tPoint = 0;
		int hPoint = 0;
		for(int i = 0;i < n; i++){
			String taro = s.next();
			String hana = s.next();
			if(taro.compareTo(hana) < 0){
				hPoint += 3;
			}else if(taro.compareTo(hana) > 0){
				tPoint += 3;
			}else{
				tPoint++;
				hPoint++;
			}
		}
		System.out.println(tPoint + " " + hPoint);
	}
	public static void main(String args[]){
		new Main().run();
	}
}