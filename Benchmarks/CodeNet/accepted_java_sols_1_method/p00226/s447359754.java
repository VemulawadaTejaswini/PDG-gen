import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int hit = 0;
			int blow = 0;
			int[] all = new int [10];
			int a2 =in.nextInt();
			int b2 =in.nextInt();
			if(a2  == 0 && b2 == 0)break;
			int[] a = new int [4];
			int[] b = new int [4];
			for(int i = 0;i < 4;i++){
				a[i] = a2 % 10;
				all[a[i]] = 1;
				a2 = a2 / 10;
			}
			for(int i = 0;i < 4;i++){
				b[i] = b2 % 10;
				if(a[i] == b[i]){
					hit++;
				}else{
					for(int j = 0;j < 4;j++){
						if(a[j] == b[i]){
							blow++;
						}
					}
				}
				b2 = b2 / 10;
			}
			System.out.println(hit +" "+blow);
		}
	}
}