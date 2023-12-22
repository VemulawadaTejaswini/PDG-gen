import java.util.Scanner;
public class Main {
    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

        long X = scan.nextLong();
        int year= 0;
        long money=100;
        while(money<X){
            money= (long) (money*1.01);
            year++;
        }
        System.out.println(year);
    }
}

