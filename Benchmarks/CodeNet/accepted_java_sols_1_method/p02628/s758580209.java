	import java.util.Scanner;
	import java.util.Arrays;

	public class Main{

		public static void main(String[] args){

			Scanner sc = new Scanner(System.in);
			int type = sc.nextInt();
			int buy = sc.nextInt();
			int typeArray[] = new int[type];

			for(int i=0; i<typeArray.length; i++){
				typeArray[i]=sc.nextInt();
			}
			Arrays.sort(typeArray);

			int sum =0;
			for(int j=0; j<buy; j++){
				sum = sum + typeArray[j];
		}
		System.out.println(sum);
	}
}
