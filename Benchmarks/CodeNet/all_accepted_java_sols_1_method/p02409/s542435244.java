import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[120];
		for(int i=0; i<120; i++){
			x[i]=0;
		}
		for(int i=0; i<n; i++){
			int b = sc.nextInt();  //?£?
			int f = sc.nextInt();  //???
			int r = sc.nextInt();  //??????
			int v = sc.nextInt();  //?????°
			int num=(b-1)*30+(f-1)*10+r;
			x[num-1]=x[num-1] + v;
		}
		for(int i=1; i<121; i++){
			System.out.print(" " + x[i-1]);
			if(i%10==0){
				System.out.println();
			}
			if(i%30==0 && i!=120){
				System.out.println("####################");
			}
		}
	}
}