import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] intArray = new int[3];
		int i = 0, buf;
		
		for(i=0;i<=intArray.length-1;i++){
			intArray[i] = scan.nextInt();
		}

		for(i=0;i<intArray.length;i++){
			for(int j=0;j<intArray.length-1;j++){
				if(intArray[j] > intArray[j+1]){
				buf = intArray[j+1];
				intArray[j+1] = intArray[j];
				intArray[j] = buf;
				}
			}
		}
		
		for(i=0;i<intArray.length-1;i++){
			System.out.print(intArray[i] + " ");
		}
		System.out.println(intArray[i]);
		scan.close();
	}
}