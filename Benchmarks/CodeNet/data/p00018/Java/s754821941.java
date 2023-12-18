import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int[] data = new int[5];
			for (int i = 0; i < data.length; i++){
				data[i] = sc.nextInt();
			}
			
			for (int i = 0; i < data.length; i++){
				if (i>0){
					System.out.print(" ");
				}
				int buff = data[i];
				int buffnum = i;
				for (int j = i; j < data.length; j++){
					if (data[j] > buff){
						buff = data[j];
						buffnum = j;
					}
				}
				data[buffnum] = data[i];
				data[i] = buff;
				System.out.print(data[i]);
			}
			System.out.println();
		}
		sc.close();
	}
}