
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] bit = new int[10];
		ArrayList<String> result = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		try{
			while(true){
				result.add(getBit(checkBit(sc.nextInt())));
			}
		}catch(NoSuchElementException e){
			//何もしない
		}
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	private static String getBit(int[] bit){
		StringBuffer str = new StringBuffer();
		for(int i = 0; i < bit.length; i++){
			if(bit[i] == 1){
				double n = Math.pow(2, i);
				str.append((int)n);
				str.append(" ");
			}
		}
		str.deleteCharAt(str.length() - 1);
		return str.toString();
	}
	
	private static int[] checkBit(int n){
		int[] bit = new int[10];
		int tmp = n;
		for(int i = 0; i < 10; i++){
			int amari = tmp % 2;
			if(amari == 1){
				bit[i] = 1;
			}
			else{
				bit[i] = 0;
			}
			tmp = tmp / 2;
		}
		return bit;
	}
}