import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNum = 0;
		int sumKati = 0;
		int sumWeight = 0;
		while(sc.hasNext()){
			caseNum++;
			int w = sc.nextInt();
			while( w != 0){
				int n = sc.nextInt();
				while(n <= 1000){
					int kati[] = new int[n];
					int weight[] = new int[n];
					for(int i = 0; i < kati.length; i++){
						kati[i] = sc.nextInt();
						if(sumKati + kati[i] <= 10000)sumKati += kati[i];
						weight[i] = sc.nextInt();
						if(weight[i] + sumWeight < w)sumWeight += weight[i];
					}
					System.out.println("case " + caseNum + ":");
					System.out.println(sumKati);
					System.out.println(sumWeight);
				}
			}
		}
	}
}