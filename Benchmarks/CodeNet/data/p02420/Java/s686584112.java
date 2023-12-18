import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
    while(kbd.hasNext()){
        String cards = kbd.next();
        if(!cards.equals("-")){
        solve(cards);
        }
    }
    }
  
    static void solve(String cards){
    int m = kbd.nextInt();
    while(m > 0){
        int a = kbd.nextInt();
        String fore = cards.substring(0, a);
        String back = cards.substring(a, cards.length());
        cards = back+fore;
        m--;
    }
    System.out.println(cards);
    }
}
