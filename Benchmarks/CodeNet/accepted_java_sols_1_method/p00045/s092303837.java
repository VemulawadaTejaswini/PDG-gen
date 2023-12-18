import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int sumSales = 0;
        int sumQuantity = 0;
        while(sc.hasNextLine()){
            String sales[] = sc.nextLine().split(",");
            number++;
            sumSales += Integer.parseInt(sales[0]) * Integer.parseInt(sales[1]);
            sumQuantity += Integer.parseInt(sales[1]);
        }
        double average = (double)sumQuantity / number;
        System.out.println(sumSales);
        System.out.println(Math.round(average));
    }
}
