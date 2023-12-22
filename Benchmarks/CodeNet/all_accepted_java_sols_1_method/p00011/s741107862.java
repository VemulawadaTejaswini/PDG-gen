import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sousuu = sc.nextInt(),henkan_suu = sc.nextInt();
		int[] jyun = new int[sousuu];
		for(int i=0;i<sousuu;i++) jyun[i]=i+1;

		for(int i=0;i<henkan_suu;i++){
			String s = sc.next();
			String[] ab = s.split(",");
			int ichi = Integer.parseInt(ab[0])-1;
			int ni   = Integer.parseInt(ab[1])-1;
			int temp = jyun[ichi];
			jyun[ichi] = jyun[ni];
			jyun[ni] = temp;
		}

		for(int i=0;i<sousuu;i++){
			System.out.println(jyun[i]);
		}
	}
}
