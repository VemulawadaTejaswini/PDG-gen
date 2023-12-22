import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] hills=new int[10];
		for(int i=0;i<10;i++){
			hills[i]=sc.nextInt();
		}
		for(int i=0;i<9;i++){
			for(int j=9;j>i;j--){
				if(hills[j]<hills[j-1]){
					int box=hills[j];
					hills[j]=hills[j-1];
					hills[j-1]=box;
				}
			}
		}
		for(int i=9;i>6;i--){
			System.out.println(hills[i]);
		}
	}
}