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
			int min = -1;
			int a;
			int b;
			for(int i = 0;i <= e;i++){
				for(int j = 0;j <= Math.sqrt(e) && (a=j*j) <= e-i;j++){
					for(int k = 0;k <= Math.cbrt(e) && (b=k*k*k) <= e-i-a;k++){
						if(min == -1 && i+a+b == e){
							min = i+j+k;
						}else if(i+a+b == e){
							min = Math.min(min,i+j+k);
						}
					}
				}
			}
			System.out.println(min);
		}
	}
}