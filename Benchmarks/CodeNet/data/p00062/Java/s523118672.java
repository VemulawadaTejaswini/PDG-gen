

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String line = sc.nextLine();
			int[] carray = new int[line.length()];
			for(int i = 0 ;i<line.length();i++){
				carray[i] = Character.getNumericValue(line.charAt(i));
			}
			for(int i=line.length();i>0;i--){
				int array[] = new int[i-1];
				for(int j = 0 ; j < i-1;j++){
					array[j] = (carray[j] + carray[j+1])%10;
				}
				if(i ==2){
					System.out.println(array[0]);
					break;
				}
				carray = array;
			}
					
		}
	}

}