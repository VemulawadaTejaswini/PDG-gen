import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] data = new int[3];
		data[0] = in.nextInt();//a
		data[1] = in.nextInt();//b
		data[2] = in.nextInt();//c
		
		int tmp;
		for(int i=0; i<data.length; i++) {
			for(int j=i+1; j< data.length; j++) {
				if(data[i]>data[j]) {
					tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
			}
		}
		
		System.out.printf("%d %d %d\n", data[0], data[1], data[2]);
	}

}