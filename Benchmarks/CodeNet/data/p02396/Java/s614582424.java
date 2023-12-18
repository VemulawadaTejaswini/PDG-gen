public class Main {
	public static void main(String[] age){

		int i;
		int[] x = new int[10000];

		for(i = 1; ;i++){
			x[i] = new java.util.Scanner(System.in).nextInt();
			if(x[i]==0) break;
		}

		for(i = 1; ;i++){
			if(x[i]==0) break;
			System.out.println("Case "+ i +": "+ x[i]);
		}
	}
}