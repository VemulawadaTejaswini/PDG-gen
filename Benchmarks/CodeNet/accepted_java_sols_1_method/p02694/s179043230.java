import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        double azuke = 100;
        int year = 0;
        if(x == 100){
            System.out.println(1);
            System.exit(0);
        }
        do{
            azuke = azuke + 0.01*azuke;
            azuke = Math.floor(azuke);
            year = year+1;
        } while(azuke < x);
        System.out.println(year);
    }
}