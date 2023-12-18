import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int maxTime = scanner.nextInt();
        int tempCost = 1001;
        for(int k = 0;k < value;k++){
            int cost = scanner.nextInt();
            int time = scanner.nextInt();
            if(time <= maxTime&&cost <= tempCost){
                tempCost = cost;
            }
        }
        if(tempCost == 1001) System.out.println("TLE");
        else System.out.println(tempCost);
    }
}
