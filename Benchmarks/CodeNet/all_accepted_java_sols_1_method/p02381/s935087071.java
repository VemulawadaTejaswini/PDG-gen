import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tokuten;
		int kazu = 0;
		double average = 0;
		double hensa2 =0.0;
		double bunsan;
		while (true){
			kazu = sc.nextInt();
			if(0==kazu) break;
			tokuten = new int[kazu];
			for(int i=0;i<tokuten.length;i++){
				tokuten[i]=sc.nextInt();
				//System.out.println();
				//System.out.println(tokuten[i]);
				average += (double)tokuten[i]/tokuten.length;
			}
			//System.out.println("average = "+average);
			for(int i=0;i<tokuten.length;i++){
				hensa2 += (tokuten[i]-average)*(tokuten[i]-average);
				//System.out.println("hensa2[0~"+i+"] = "+hensa2);
			}
			bunsan=hensa2/tokuten.length;
			//System.out.println("bunsan = "+bunsan);
			System.out.println(Math.sqrt(bunsan));

			/* 初期化 */
			average = 0;
			hensa2 = 0;
			kazu =0;
		}
	}
}
