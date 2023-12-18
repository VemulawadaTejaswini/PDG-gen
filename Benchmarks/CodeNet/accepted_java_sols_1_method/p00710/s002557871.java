import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int count;
		int p, c;

		while(true){
			num = sc.nextInt();
			count = sc.nextInt();
			if(num==0&&count==0) break;

			int[][] array = new int[2][num];

			for(int i=0; i<num; i++){
				array[0][i] = num-i;
			}

			for(int i=0; i<count; i++){
				p = sc.nextInt();
				c = sc.nextInt();
				System.arraycopy(array[0], p-1, array[1], 0, c);
				System.arraycopy(array[0], 0, array[1], c, p-1);
				System.arraycopy(array[0], p+c-1, array[1], p+c-1, num-p-c+1);
				System.arraycopy(array[1], 0, array[0], 0, num);
			}
			
			System.out.println(array[0][0]);
		}
	}
}