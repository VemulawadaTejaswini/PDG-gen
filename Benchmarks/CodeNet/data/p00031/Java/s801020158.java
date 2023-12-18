import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		new Main().run();
	}

	void run(){
		Scanner sc =  new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			if(!sc.hasNext()){
				break;
			}
			int[] b = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
			for(int i=0; i < b.length; i++){
				if(a >= b[i]){
					System.out.print(b[i]);
				}
				System.out.println("");
			}
		}
	}
}