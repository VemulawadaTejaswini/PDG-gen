import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i=0; i<10; i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for(int i=0; i<3; i++){
			System.out.println(a[9-i]);
		}
    }
}