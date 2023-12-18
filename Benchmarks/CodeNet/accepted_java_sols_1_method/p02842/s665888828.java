import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int includedTax = sc.nextInt();
        int includedTax2 = includedTax + 1;
        int nomineeExcludedTax = (int) (includedTax / 1.08);
        int nomineeExcludedTax2 = (int) (includedTax2 / 1.08);
        int calculatedIncludedTax = (int) (nomineeExcludedTax * 1.08);
        int calculatedIncludedTax2 = (int) (nomineeExcludedTax2 * 1.08);
        System.out.println(includedTax == calculatedIncludedTax ? nomineeExcludedTax : includedTax == calculatedIncludedTax2 ? nomineeExcludedTax2 : ":(");
    }
}
