import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] arh) {
		Scanner sc=new Scanner(System.in);
		int kaisu=sc.nextInt();
		int[] bl=new int[kaisu];


		for(int i=0; i<kaisu; i++) {
			bl[i]=sc.nextInt();
		}
		Arrays.sort(bl);

		int points=0;
		int now_counter=1;
		int now_pointer=bl[0];
		int last_update=0;
		for(int i=1; i<kaisu; i++) {
			if(bl[i]!=now_pointer) {
				points+=now_counter%2;
				now_pointer=bl[i];
				now_counter=1;
				last_update=i;
			}
			else {
				now_counter++;
			}
		}
		points+=now_counter%2;

		System.out.println(points);
	}
}