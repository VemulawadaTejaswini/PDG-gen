import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//??????????????°
		int[] mountain;
		int taihi;

		//??????
		Scanner sc = new Scanner(System.in);

		mountain = new int[10];
		for(int i=0; i<10; i++){
			mountain[i] = sc.nextInt();
		}


		for(int i=0; i<mountain.length; i++){
			for(int y = i+1; y<mountain.length; y++){
				if(mountain[i]<mountain[y]){
					taihi = mountain[i];
					mountain[i] = mountain[y];
					mountain[y] = taihi;
				}
			}
		}
		for(int i=0; i<3; i++){
			System.out.println(mountain[i]);
		}
	}
}