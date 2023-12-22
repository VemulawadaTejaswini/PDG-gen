import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] a=new int[5];
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		a[4] = sc.nextInt();
		int k = sc.nextInt();
		boolean e=false;
		for(int i = 0; i<5; i++){
			for(int j = i+1; j<5; j++){
				if(!(Math.abs(a[i]-a[j])<=k)){
					System.out.println(":(");
					return;
				}
			}
		}
		System.out.println("Yay!");	
	}
}
