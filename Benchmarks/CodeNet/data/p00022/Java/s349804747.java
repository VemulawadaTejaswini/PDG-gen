import java.util.Scanner;

public class aoj0022 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num!=0){
			int max = 0;
			int[] data = new int[num];
			for(int i=0 ; i<num ; i++)
				data[i] = s.nextInt();
			for(int i=0 ; i<num ; i++){
				int sum = 0;
				for(int j=i ; j<num ; j++){
					sum+=data[k];
					if(max<sum)
						max=sum;
				}
			}
			num = s.nextInt();
			System.out.println(max);
		}
    }
}