import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] data = new int[3];
		for(int i=0; i<3; i++) {
			data[i]=sc.nextInt();
		}
		int max=data[0];
		for(int i=0; i<3; i++) {
			if(data[i]>max) {
				max=data[i];
			}
		}
		int ans = (max*10)+data[0]+data[1]+data[2]-max;
		System.out.println(ans);
	}
}