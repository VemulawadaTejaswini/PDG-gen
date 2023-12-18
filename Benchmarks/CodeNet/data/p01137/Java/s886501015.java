import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int e = scan.nextInt();
			if(e == 0){
				break;
			}
			int min = e;
			int a;
			for(int i = 0;i <= e;i++){
				for(int j = 0;(a=j*j) <= e-i && j <= Math.sqrt(e) && i+j < min;j++){
					for(int k = 0;k*k*k <= e-i-a && k <= Math.cbrt(e);k++){
						if(i+a+(k*k*k) == e){
							min = Math.min(min,i+j+k);
						}
					}
				}
			}
			System.out.println(min);
		}
	}
}