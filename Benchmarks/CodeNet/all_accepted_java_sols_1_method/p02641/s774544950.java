import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner scan =  new Scanner(System.in);
			int X = scan.nextInt();
			int N = scan.nextInt();
			int[] num = new int[102];
			for(int i=0;i<N;i++){
				int c = scan.nextInt();
				num[c] = 1;
			}

			if(num[X] == 0){
				System.out.println(X);
			}else{
				int i = 1;
				while(true){
					if(X-i>=0){
						if(num[X-i] == 0){
							System.out.println(X-i);
							break;
						}
					}
					if(X+i<102){
						if(num[X+i] == 0){
							System.out.println(X+i);
							break;
						}
					}
					i++;
				}
			}
	}
}
