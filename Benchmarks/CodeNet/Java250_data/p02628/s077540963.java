import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numList = sc.nextLine().split(" ");
        String[] priceList = sc.nextLine().split(" ");

        int sumNumber = Integer.parseInt(numList[1]);

        //sort priceList by asc
        ArrayList<Integer> priceListAsc = new ArrayList<>();
        for(String str : priceList){
            priceListAsc.add(Integer.parseInt(str));
        }

        Collections.sort(priceListAsc);
        int minSum = 0;
        for(int i = 0;i < sumNumber; i++){
            minSum = minSum + priceListAsc.get(i);
        }
        System.out.println(minSum);
    }
}
