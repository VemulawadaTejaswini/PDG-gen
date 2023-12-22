import java.util.Scanner;
import java.util.LinkedList;
import java.lang.Math;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();

        long c500 = x/500;
        long c5 = (x-c500*500)/5;
        long iei = 1000*c500 + 5*c5;

        System.out.print(iei);

    }
}