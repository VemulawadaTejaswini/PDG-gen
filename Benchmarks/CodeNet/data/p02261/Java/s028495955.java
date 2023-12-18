import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String[] cards = sc.nextLine().split(" ");

        showBubbleSortResult(cards);
        showSelectionSortResult(cards);
    }

    public static void showBubbleSortResult(String[] arrayOrg) {
        String[] array = arrayOrg.clone();

        for (int i=0; i<array.length; i++) {
            for (int j=array.length-1; j>i; j--) {
                int leftNum = Integer.parseInt(array[j-1].substring(1, 2));
                int rightNum = Integer.parseInt(array[j].substring(1, 2));

                if (leftNum > rightNum) {
                    String tmp = array[j-1];
                    array[j-1]  = array[j];
                    array[j] = tmp;
                }
            }
        }

        // show sorted result
        System.out.println(String.join(" ", array));

        // show stable or 'not stable'
        checkStable(arrayOrg, array);
    }

    public static void showSelectionSortResult(String[] arrayOrg) {
        String[] array = arrayOrg.clone();

        for (int i=0; i<array.length; i++) {
            int minj = i;
            for (int j=i; j<array.length; j++) {
                int leftNum = Integer.parseInt(array[minj].substring(1, 2));
                int rightNum = Integer.parseInt(array[j].substring(1, 2));
                if (leftNum > rightNum) { minj = j; }
            }
            String tmp = array[minj];
            array[minj]  = array[i];
            array[i] = tmp;
        }

        // show sorted result
        System.out.println(String.join(" ", array));

        // show stable or 'not stable'
        checkStable(arrayOrg, array);

    }

    public static void checkStable(String[] inArr, String[] outArr) {


        for (int i=0; i<inArr.length; i++) {
            for (int j=i+1; j<inArr.length; j++) {
                for (int a=0; a<outArr.length; a++) {
                    for (int b=a+1; b<outArr.length; b++) {
                        int numi = Integer.parseInt(inArr[i].substring(1, 2));
                        int numj = Integer.parseInt(inArr[j].substring(1, 2));

                        if (numi == numj && inArr[i].equals(outArr[b]) && inArr[j].equals(outArr[a]) ) {
                            System.out.println("Not stable");
                            return;
                        }
                    }
                }
            }
        }

        System.out.println("Stable");
    }
}
