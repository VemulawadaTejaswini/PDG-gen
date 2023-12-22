import java.util.*;
public class Main{
	public static void main(String[] args){
		int[] a = {-1,-1,-1,-1,-1,-1};
		int dis;
		boolean is = true;
		Scanner sc = new Scanner(System.in);
		while(a[0] < 0 || a[1] < 0 || a[2] < 0 || a[3] < 0 || a[4] < 0 || a[5] < 0|| a[0] > 123 || a[1] > 123 || a[2] > 123 || a[3] > 123 || a[4] > 123|| a[5] > 123|| a[0] > a[1] || a[1] > a[2] || a[2] > a[3] || a[3] > a[4]){
			for(int i = 0; i < 6; i++){
				a[i] = sc.nextInt();
			}
		}
		for(int i = 0; i < 4; i++){
			for(int j = i + 1; j < 5; j++){
				dis = a[j] - a[i];
				if(dis > a[5]){
					System.out.println(":(");
						i = 4;
						j = 6;
						is = false;
				}
			}
		}
			if(is){
				System.out.println("Yay!");
			}
	}
}