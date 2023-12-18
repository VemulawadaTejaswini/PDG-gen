import java.util.*;
import java.util.Scanner;

class Dice{
    private int one_;
    private int two_;
    private int three_;
    private int four_;
    private int five_;
    private int six_;
    
    Dice(int one, int two, int three, int four, int five, int six){
        one_ = one;
        two_ = two;
        three_ = three;
        four_ = four;
        five_ = five;
        six_ = six;
    }
    
    int swapFaces(String ways){
        char[] way = new char[ways.length()];
        
        for(int i = 0; i < ways.length(); i++){
            way[i] = ways.charAt(i);
            
            int tmp;
            switch(way[i]){
                case 'E':
                    tmp = one_;
                    one_ = four_;
                    four_ = six_;
                    six_ = three_;
                    three_ = tmp;
                    break;
                case 'N':
                    tmp = one_;
                    one_ = two_;
                    two_ = six_;
                    six_ = five_;
                    five_ = tmp;
                    break;
                case 'S':
                    tmp = one_;
                    one_ = five_;
                    five_ = six_;
                    six_ = two_;
                    two_ = tmp;
                    break;
                case 'W':
                    tmp = one_;
                    one_ = three_;
                    three_ = six_;
                    six_ = four_;
                    four_ = tmp;
                    break;
            }
        }
        return one_;
    }
    
}
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Dice d = new Dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        // d.one = sc.nextInt();
        // d.two = sc.nextInt();
        // d.three = sc.nextInt();
        // d.four = sc.nextInt();
        // d.five = sc.nextInt();
        // d.six = sc.nextInt();
        
        String way = sc.next();
        System.out.println(d.swapFaces(way));
    }
}

