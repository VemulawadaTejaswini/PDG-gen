import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String line = scan.nextLine();
		String[] array = line.split(" ");
		for(int i = n-1;i>0;i--){
			if(i==n-1){
				System.out.print(array[i]);
			}else{
				System.out.print(" "+array[i]);
			}
		}
		System.out.println();
	}
}