import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner $ = new Scanner(System.in);
		int S = $.nextInt(), Flag = 0;
		int[] s = {S / 100, S % 100};
		for (int i = 0; i < 2; i++){
			if (s[i] > 0 && s[i] < 13){
				Flag += (i + 1);
			}
		}
		if (Flag == 0){
			System.out.println("NA");
		}
		else if (Flag == 1){
			System.out.println("MMYY");
		}
		else if (Flag == 2){
			System.out.println("YYMM");
		}
		else if (Flag == 3){
			System.out.println("AMBIGUOUS");
		}
		/*
		1905 -> YYMM
		0112 -> AMBIGUOUS
		1700 -> NA
		*/
	}
}
