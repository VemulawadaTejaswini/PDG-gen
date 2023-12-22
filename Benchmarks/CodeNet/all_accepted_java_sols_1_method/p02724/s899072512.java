import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int big = x/500;
        int small = (x-(x/500)*500)/5;
        System.out.println(big*1000+small*5);
    }
}