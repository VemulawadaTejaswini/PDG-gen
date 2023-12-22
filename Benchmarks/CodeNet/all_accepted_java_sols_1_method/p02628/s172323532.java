import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int fruitTypeNum = console.nextInt();
        int buyFruitNum = console.nextInt();
        console.nextLine();

        ArrayList<Integer> minPrices = new ArrayList<Integer>(fruitTypeNum);
        for(int i = 0; i < fruitTypeNum; i++){
            minPrices.add(console.nextInt());
        }
        Collections.sort(minPrices);

        int total = 0;
        for(int i = 0; i < buyFruitNum; i++){
            total += minPrices.get(i);
        }
        System.out.println(total);
    }
}
