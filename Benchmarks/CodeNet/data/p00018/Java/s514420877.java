import java.util.*;
public class Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i<5; i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
	System.out.print(a[4]+" "+a[3]+" "+a[2]+" "+a[1]+" "+a[0]);
	}

}