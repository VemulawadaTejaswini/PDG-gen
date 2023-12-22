import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] strArr = scan.nextLine().split(" ");
        int arrLen = strArr.length;
        int[] intArr = new int[arrLen];

        for (int i=0; i<arrLen; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int swapNum = 0;
        int tmp;

        for (int i=0; i<arrLen; i++){
            for (int j=arrLen-1; j>i; j--){
                if (intArr[j] < intArr[j-1]){
                    tmp = intArr[j];
                    intArr[j] = intArr[j-1];
                    intArr[j-1] = tmp;
                    swapNum += 1;
                }
            }
        }

        for (int i=0; i<arrLen; i++){
            strArr[i] = String.valueOf(intArr[i]);
        }

        System.out.println(String.join(" ", strArr));
        System.out.println(swapNum);
    }
}