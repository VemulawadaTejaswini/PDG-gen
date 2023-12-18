import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> iwashies = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int iwashi = a * b;
            iwashies.add(iwashi);
        }

        int challNum = 0;
        for(int p = 0; p < n; p++) {
            //p番目と仲よしの数を数える
            int target = iwashies.indexOf(p);
            int favCount = 0;
            for(int r = p + 1; r < n; r++){
                int partner = iwashies.indexOf(r);
                if(target + partner != 0) {
                    target += 1;
                }
            }
            for(int j = 0; j < favCount; j++) {
                challNum += calcNumOfCombination(favCount,j);
            }
        }
        String result = String.valueOf(challNum%1000000007);
            
        System.out.println(String.valueOf(result));

    }

    int calcNumOfCombination(int n, int r){
        int num = 1;
        for(int i = 1; i <= r; i++){
            num = num * (n - i + 1) / i;
        }
        return num;
    }
}