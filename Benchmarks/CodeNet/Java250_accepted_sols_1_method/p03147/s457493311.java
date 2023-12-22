import java.util.Scanner;

 

public class Main {

 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int flowerNum = scan.nextInt();                        // 花の総本数
        int[] flowerHeightList = new int[flowerNum];             // 花の高さを入れる配列
        int count = 0;                                             // 水やり回数

 

        /* データ入力 */
        for (int i = 0; i < flowerNum; i++) {
            flowerHeightList[i] = scan.nextInt();
        }

 

        int tmp = 0;
        int head = 0;
        

 

        while(head < flowerNum) {
            // 先頭の高さが0だった場合、次の要素を先頭とする
            if(flowerHeightList[head] == 0) {
                tmp = ++head;
                continue;
            }
            // 水やりの範囲を決定する
            for(int tail = head; tail < flowerNum; tail++) {
                if(flowerHeightList[tail] == 0) {
                    head = tmp;
                    break;
                }
                flowerHeightList[tail]--;
            }
            count++;
        }

 

        System.out.println(count);
        scan.close();
    }

 

}