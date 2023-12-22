import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val =sc.nextInt();
        int gold =sc.nextInt();
        int fav = sc.nextInt();
        int count = gold/val;
        System.out.println(count > fav?fav:count);
    }
}