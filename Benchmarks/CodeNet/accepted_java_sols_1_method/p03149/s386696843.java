import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] e = new int[10];
		e[1]=0;
		e[9]=0;
		e[4]=0;
		e[7]=0;
		for(int i = 0; i<4; i++){
			int a = sc.nextInt();
			if(a==1 || a==9 || a==7 || a==4){
				e[a]++;
			}
		}
		if(e[1]>=1 && e[9]>=1 && e[7]>=1 && e[4]>=1){
			System.out.println("YES");
			return;
		}
		System.out.println("NO");
	}
}