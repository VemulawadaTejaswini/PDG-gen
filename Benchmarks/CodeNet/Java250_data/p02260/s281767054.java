import java.util.Scanner;
import java.util.Arrays;

class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] inputStr = scan.nextLine().split(" ");
        int inputLen = inputStr.length;
        int[] inputInt = new int[inputLen];

        for (int i=0; i<inputLen; i++){
            inputInt[i] = Integer.parseInt(inputStr[i]);
        }

        int tmp;
        int numExchange = 0;
        int minj;
        for (int i=0; i<inputLen-1; i++){
            minj = i;
            for (int j=i+1; j<inputLen; j++){
                if (inputInt[minj] > inputInt[j]){
                    minj = j;
                }
            }
            tmp = inputInt[i];
            inputInt[i] = inputInt[minj];
            inputInt[minj] = tmp;
            if (i != minj)
                numExchange += 1;
        }
        for (int i=0; i<inputLen; i++){
            inputStr[i] = String.valueOf(inputInt[i]);
        }
        System.out.println(String.join(" ", inputStr));
        System.out.println(numExchange);
    }
}