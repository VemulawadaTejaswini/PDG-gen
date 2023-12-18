import java.util.ArrayList;
import java.util.Scanner;

class Item {
    int value,weight; //????????????????????????
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
    public int getValue() {
        return this.value;
    }
    public int getWeight() {
        return this.weight;
    }
}

public class Main {
    
    static int N,W; //??????????????°?????????
    static int Nmax = 105;
    static int Wmax = 10005;
    static ArrayList<Item> items = new ArrayList<>(); //???????????????????????????
    static int[][] C = new int[Nmax+1][Wmax+1]; //?????????????¨?????????§????????????
    
    public static int knapsack() {
        int result = 0;
        int maxVal = 0;
        for(int i = 1; i <= N; i++) {
            for(int w = 1; w <= W; w++) {
                if(items.get(i).getWeight() <= w) {
                    if(items.get(i).getValue() + C[i-1][w - items.get(i).getWeight()] > C[i-1][w]) {
                        C[i][w] = items.get(i).getValue() + C[i-1][w - items.get(i).getWeight()];
                    } else {
                        C[i][w] = C[i-1][w];
                    }
                }else{
                    C[i][w] = C[i-1][w]; //?????????????????????
                }
            }
            maxVal = C[N][W];
        }
        return result=maxVal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        
        Item padding = new Item(0,0);
        items.add(padding);
        
        for(int i = 0; i < N; i++) {
            Item item = new Item(sc.nextInt(),sc.nextInt());
            items.add(item);
        }
        
        System.out.println(knapsack());
    }
    
}