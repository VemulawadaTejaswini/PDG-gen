import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int times, time_count;
        while(sc.hasNext()){
            String word = sc.next();
            if(word.equals("-")) break;
               times = sc.nextInt();
            for(int i = 0; i < times; i++){
                time_count = sc.nextInt();
                word = word.substring(time_count, word.length()) + word.substring(0, time_count);
            }
            System.out.println(word);
        }
    }
}
