import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A= sc.nextInt(),B=sc.nextInt();
		int Amin= A*100/8, Amax=(A+1)*100/8,Bmin= B*100/10, Bmax=(B+1)*100/10;
		if(A%2==1) {
			Amin+=1;
		}
		int ans = -1;
		for(int i=Amin;i<Amax;i++) {
			if(Bmin<=i&&Bmax>i) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}
