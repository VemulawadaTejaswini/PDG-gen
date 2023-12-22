import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[]=new int[3];
	for(int i=0;i<3;i++){
		a[i]=sc.nextInt();
	}
		Arrays.sort(a);
		for(int i=0;i<2;i++){
			System.out.print(a[i]+" ");
		}System.out.println(a[2]);
	
	}
}