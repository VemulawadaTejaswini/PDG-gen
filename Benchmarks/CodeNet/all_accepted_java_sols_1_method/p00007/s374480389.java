import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		Scanner scan = new Scanner(System.in);

		int n=scan.nextInt();
		long m=100000;
		for(int i=0;i<n;i++){
			m=(long)(1.05*m);
			if(m%1000>0){
				m+=1000;
				m-=m%1000;
			}
		}
		System.out.println(m);
	}

}