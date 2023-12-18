
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int [][]array=new int[num][3];
		for(int i=0;i<num;i++){
			array[i][0]=sc.nextInt();
			array[i][1]=sc.nextInt();
			array[i][2]=sc.nextInt();
		}
		for(int i=0;i<num;i++){
			if(array[i][0]<array[i][1]+array[i][2]){
				System.out.println("No");
				return;
			}
		}
		boolean flag=true;
		for(int i=0;i<num;i++){
			if(array[i][0]%2!=(array[i][1]+array[i][2])%2){
				flag=false;
			}
		}
		if(flag){
			System.out.println("Yes");	
		}else{
			System.out.println("No");
		}
		
	}

}
