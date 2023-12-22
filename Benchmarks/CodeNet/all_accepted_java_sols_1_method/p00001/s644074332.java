import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] hills = new int[10];
		for(int i=0;i<10;i++)
			hills[i]=in.nextInt();
		for(int i=0;i<3;i++){
			for(int j=i+1;j<10;j++){
				if(hills[j]>hills[i]){
					int tmp;
					tmp=hills[i];
					hills[i]=hills[j];
					hills[j]=tmp;
				}
			}
		}
		for(int i=0;i<3;i++)
			System.out.println(hills[i]);
	}

}