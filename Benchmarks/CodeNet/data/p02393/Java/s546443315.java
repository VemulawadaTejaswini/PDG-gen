import java.util.Scanner; 
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] Array = line.split(" ");
		int[] numArray = parseInt(Array);
		for(int i = 0; i<numArray.length-1;i++){
			for(int j = numArray.length-1 ; j>i;j--){
				if(numArray[j]<numArray[j-1]){
					int number = numArray[j-1];
					numArray[j-1] = numArray[j];
					numArray[j] = number;

				}
			}
		}
		for(int i : numArray){
			System.out.print(i);
		}
		System.out.println();
	}
	public static int[] parseInt(String[] Array){
		int[] numArray = new int[Array.length];
		for(int i = 0; i<Array.length ; i++){
			numArray[i] = Integer.parseInt(Array[i]);
		}
		return numArray; 
	} 

}