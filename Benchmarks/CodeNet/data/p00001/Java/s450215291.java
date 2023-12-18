import java.util.*;
import java.io.*;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ツ篠ゥツ督ョツ青カツ青ャツつウツづェツつスツδソツッツドツ・ツスツタツブ
		int[] mountains = new int[args.length];

		for(int i =0;i<args.length;i++){
		int temp = Integer.valueOf(args[i]).intValue();
			mountains[i]=temp;
		}
		java.util.Arrays.sort(mountains);
		for (int i=args.length-1;i>args.length-4;i--){
			System.out.println(mountains[i]);
	}
	}
}