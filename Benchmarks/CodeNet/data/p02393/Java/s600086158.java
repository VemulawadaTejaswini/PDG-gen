import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int[] intArray = {a, b, c};
	for(int i = 0; i < intArray.length-1; i++){
        for(int j = i+1; j < intArray.length; j++){
            if(intArray[j] < intArray[i]){
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }
    }
	for(int i = 0; i < 3; i++) {
		System.out.print(intArray[i] + " ");
	}
	System.out.println();
	}
}