import java.util.Scanner;

class Main {
	 public static void main(String[] a){
		 Scanner scan = new Scanner(System.in);

		 int[] m = new int[10];
		 int[] max = new int[3];
		 for(int i = 0; i < 10; i++){
			 m[i] = scan.nextInt();
			 if(m[i] >= max[0]){
				 max[2] = max[1];
				 max[1] = max[0];
				 max[0] = m[i];
			 }
			 else if(m[i] >= max[1]){
				 max[2] = max[1];
				 max[1] = m[i];
			 }
			 else if(m[i] >= max[2]){
				 max[2] = m[i];
			 }
		 }

		 for(int i = 0; i <= 2; i++){
			 System.out.println(max[i]);
		 }
	}
}