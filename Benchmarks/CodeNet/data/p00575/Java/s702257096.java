import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(socialGame(a,b,c));
    }

public static int socialGame(int coinPerDay, int coinBonusWeek, int totalCoin){
        int dayPaid = 0;
        int coinInWeek = 7*coinPerDay + coinBonusWeek;
        int redundant = totalCoin%coinInWeek;
        int weekPaid = totalCoin/coinInWeek;


        if (redundant == 0){
            dayPaid = 7*weekPaid;
        }else if (redundant > 7*coinPerDay){
            dayPaid = 7*(weekPaid+1);
        }else {
            dayPaid = 7*weekPaid + redundant/coinPerDay;
            if (redundant % coinPerDay != 0){
                dayPaid++;
            }
        }

        return dayPaid;
    }

}
