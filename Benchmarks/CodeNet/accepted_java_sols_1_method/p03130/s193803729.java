import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int[] b = new int[3];
		int[] count = new int[4];

		for(int i=0; i<3; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			count[a[i]-1]++;
			count[b[i]-1]++;
		}
		for(int i=0; i<4; i++){
			if(count[i]>2){
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
    }
}
