import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//dirichlet();
		fortune();
		
	}
	
	public static void fortune(){
		Scanner sc = new Scanner(System.in);
		int numOfData = sc.nextInt();
		for(int i = 0; i < numOfData; i++){
			int ini = sc.nextInt();
			int years = sc.nextInt();
			int num = sc.nextInt();
			int max = 0;
			for(int j = 0; j < num; j++){
				int isSev = sc.nextInt();
				double per = sc.nextDouble();
				int hand = sc.nextInt();
				int sum = ini;
				if(isSev == 1){
					for(int k = 0; k < years; k++){
						double plus = sum * per;
						int add = (int)plus;
						sum += add - hand;
					}
				}
				else{
					int save = 0;
					for(int k = 0; k < years; k++){
						//System.out.print(sum + " ");
						double plus = sum * per;
						int add = (int)plus;
						//System.out.print(add + " ");
						save += add;
						sum -= hand;
						//System.out.print(sum + " ");
						//System.out.println(add + " ");
					}
					sum += save;
					//System.out.println(sum);
					
				}
				if(max < sum){
					max = sum;
					
				}

				
			}
			System.out.println(max);
			
		}
		
	}