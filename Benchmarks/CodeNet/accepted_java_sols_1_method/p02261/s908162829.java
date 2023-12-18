import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] array = new String[n];
		array = scanner.nextLine().split(" ");
		scanner.close();
        String[] arrayB = array.clone();
        String[] arrayS = array.clone();

        //バブルソート
       for(int i = 0; i < n; i++) {
    	   for(int j = n - 1; j > i; j--) {
    		   if((int)arrayB[j - 1].charAt(1) > (int) arrayB[j].charAt(1)) {
    			   String tmp = arrayB[j - 1];
    			   arrayB[j - 1] = arrayB[j];
    			   arrayB[j] = tmp;
    		   }
    	   }
       }
       //出力
       for(int i = 0; i < arrayB.length; i++){
           System.out.print((i == 0 ? "" : " ") + arrayB[i]);
       }
       System.out.println();
       System.out.println("Stable");

       //選択ソート
       for(int i = 0; i < n; i++) {
    	   int minIndex = i;
    	   for(int j = i; j < n; j++) {
    		   if((int)arrayS[minIndex].charAt(1) > (int) arrayS[j].charAt(1)) {
    			   minIndex = j;
    		   }
    	   }
    	   //最小値を持つ添え字の値が変わっていなければ値交換はしなくてよい
    	   if(minIndex == i) continue;
    	   //値交換
    	   String tmp = arrayS[i];
		   arrayS[i] = arrayS[minIndex];
		   arrayS[minIndex] = tmp;
       }
       //出力
       for(int i = 0; i < arrayS.length; i++){
           System.out.print((i == 0 ? "" : " ") + arrayS[i]);
       }
       System.out.println();
       if(Arrays.equals(arrayS, arrayB)) {
       	System.out.println("Stable");
       }else {
       	System.out.println("Not stable");
       }
	}
}
