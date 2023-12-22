import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] colors = new int[8];
		int ra = 0,total = 0,max;
		for(int i = 0;i <n;i++) {
			int a = sc.nextInt();
			if(1 <= a && a< 400) {
				colors[0] = 1;
			}else if(400 <= a && a< 800) {
				colors[1] = 1;
			}else if(800 <= a && a< 1200) {
				colors[2] = 1;
			}else if(1200 <= a && a< 1600) {
				colors[3] = 1;
			}else if(1600 <= a && a< 2000) {
				colors[4] = 1;
			}else if(2000 <= a && a< 2400) {
				colors[5] = 1;
			}else if(2400 <= a && a< 2800) {
				colors[6] = 1;
			}else if(2800 <= a && a< 3200) {
				colors[7] = 1;
			}else if(3200 <= a) {
				ra++;
			}
		}
		for(int i = 0;i <8;i++) {
			total = total + colors[i];
		}
		max = total +ra;
      	if(total < 1) {
			total = 1;
		}
		System.out.println(total+" "+max);
	}

}