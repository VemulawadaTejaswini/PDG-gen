import java.util.Scanner;

class saihinti {
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		cin.useDelimiter("\\r\\n");
		int [] x = new int[100];
		int [] y = new int[100];
		int i = 0;
		int j = 0;
		int a = 0;
		
		while (cin.hasNextInt()){
			x[i] = cin.nextInt();
			y[x[i]]++;
			i++;
		}
		
		for (j = 0; j < i; j++){
			if (a < y[j]){
				a = j;
			}
		}
		for (j = 0; j < i; j++){
			if (a == y[j]){
				System.out.println(j);
			}
		}
	}
}