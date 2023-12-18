import java.util.Scanner;
public class test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int array[] = new int[100];
		int count = 0;
		while(true){
			int tmp = sc.nextInt();
			array[count] = tmp;
			count ++ ;
			if(tmp ==0){
				break;
			}
		}
		for( int k =0;k<count;k++){
			System.out.println("Case " + (k+1) + ": " +array[k]);
		}
	}
}