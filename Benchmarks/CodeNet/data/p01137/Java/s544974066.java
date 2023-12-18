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
			int k;
			for(int i = (int)Math.cbrt(e);i >= 0;i--){
				a = i*i*i;
				for(int j = (int)Math.sqrt(e-a);j >= 0;j--){
					k = e-a-(j*j);
					if(k+(j*j)+a == e && i+j+k < min){
						min = i+j+k;
					}
				}
			}
			System.out.println(min);
		}
	}
}