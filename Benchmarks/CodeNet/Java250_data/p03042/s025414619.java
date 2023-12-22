import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int first = num / 100;
        int second = num - (first * 100);
        if((first < 1 || first > 12) && (second >= 1 && second <= 12)) System.out.println("YYMM");
        else if((second < 1 || second > 12) && (first >= 1 && first <= 12)) System.out.println("MMYY");
        else if((first >= 1 && first <= 12) && (second >= 1 && second <= 12)) System.out.println("AMBIGUOUS");
        else System.out.println("NA");
	}
}