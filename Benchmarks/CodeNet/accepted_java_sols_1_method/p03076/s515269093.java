import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array=new int[5];
		array[0]=sc.nextInt();
		array[1]=sc.nextInt();
		array[2]=sc.nextInt();
		array[3]=sc.nextInt();
		array[4]=sc.nextInt();
		int bmax=0,max=0;

		for(int i=0;i<5;i++) {
			while(max%10!=0) {
				max++;
			}
			max+=array[i];
			if(array[i]%10==0) {
				array[i]=10;
			}else {
				array[i]=array[i]%10;
			}
			//System.out.println(max);
		}
		while(max%10!=0) {
			max++;
		}
		Arrays.sort(array);
		System.out.println(max-(10-array[0]));
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


