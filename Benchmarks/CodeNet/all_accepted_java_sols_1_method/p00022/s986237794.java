import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num!=0){
			int max = Integer.MIN_VALUE;
			int[] data = new int[num];
			for(int i=0 ; i<num ; i++)
				data[i] = s.nextInt();
			for(int i=0 ; i<num ; i++){
				int sum = 0;
				for(int j=i ; j<num ; j++){
					sum+=data[j];
					if(max<sum)
						max=sum;
				}
			}
			num = s.nextInt();
			System.out.println(max);
		}
    }
}