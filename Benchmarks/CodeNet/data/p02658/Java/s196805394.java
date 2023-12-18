import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scn = new Scanner(System.in);
		int  N = scn.nextInt();
		int array[];
		if(N>=2 && N<=(10*10*10*10*10)) {
			array=new int[N];
			for(int i=0; i<array.length; i++) {
				int  M = scn.nextInt();
				array[i]=M;
				System.out.println(array[i]);
			}
			int a=1;
				for(int i=0; i<array.length; i++) {
					a=array[i]*a;
				}
				if(a>=0 && a<=(10*10*10*10*10*10*10*10)){
					System.out.println("-1");
				}
				System.out.println(a);
		}

}
}