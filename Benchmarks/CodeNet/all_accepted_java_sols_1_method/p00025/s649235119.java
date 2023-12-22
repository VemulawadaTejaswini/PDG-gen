import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int[] a = new int[4];
			int[] b = new int[4];
			int hitcount = 0,browcount = 0;
			for(int i = 0; i < 4;i++ ){
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < 4;i++ ){
				b[i] = sc.nextInt();
			}
			for(int i = 0; i < 4;i++ ){
				for(int j  = 0; j < 4 ; j++){
					if(a[i] == b[j]){
						if(i == j){
							hitcount++;
						}else if(i != j){
							browcount++;
						}
					}
				}
			}
			System.out.printf("%d %d\n",hitcount,browcount);
		}
	}
}