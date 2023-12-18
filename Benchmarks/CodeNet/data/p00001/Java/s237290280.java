import java.util.*;
import java.io.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		int[] mountains = new int[10];

		for(int i =0;i<10;i++){
		int temp = Integer.valueOf(args[i]).intValue();
			mountains[i]=temp;
		}
		java.util.Arrays.sort(mountains);
		for (int i=9;i>6;i--){
			System.out.println(mountains[i]);
		}
		return;

	}
}