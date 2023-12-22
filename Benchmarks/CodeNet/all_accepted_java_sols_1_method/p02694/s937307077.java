import java.util.*;
public class Main {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long money = 100;
        long year = 0;
        while(true){
            money = (long)(money*1.01);
            year++;
            if(money>=X){
                break;
            }
        }
        System.out.println(year);
    }
}