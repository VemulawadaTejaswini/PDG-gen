import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0;i<x; i++){
			int [] a = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
			Arrays.sort(a);
			if(a[0]*a[0] + a[1]*a[1] == a[2]*a[2]) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}