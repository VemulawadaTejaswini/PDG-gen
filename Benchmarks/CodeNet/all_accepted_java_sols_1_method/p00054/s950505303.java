import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;cin.hasNext();){
			int[] array=new int[10001];
			int a=cin.nextInt();
			int b=cin.nextInt();
			int c=cin.nextInt();
			a = a%b;
			a*=10;
			for(int i=0;i<10001;i++){
				array[i]=a/b;
				a=(a%b)*10;
			}
			int ans=0;
			for(int i=0;i<c;i++){
				ans+=array[i];
			}
			System.out.println(ans);
		}
	}

}