

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] intArray = new int[999999999];
        for (int i = 0; i < n1; i++) {
            intArray[i] = sc.nextInt();
        }

        int count = 0;
        for (int i= 0; intArray[i] != 0; i++) {
            for (int j = i + 1; intArray[j] != 0; j++) {
                if (intArray[i] == intArray[j]) {
                   continue;
                }
                for (int k = j + 1; intArray[k] != 0; k++) {
                    if ((intArray[i] + intArray[j] > intArray[k]) && (intArray[j] + intArray[k] > intArray[i]) && (intArray[k] + intArray[i] > intArray[j])) {
                        if (intArray[i] != intArray[k] && intArray[j] != intArray[k]) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }

}
