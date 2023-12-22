import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String word1 = sc.nextLine();
        int counter = 0;
        for(int p=0; p<word.length(); p++){
            if(word.charAt(p) != word1.charAt(p)){
                ++counter;
            }

        }
        System.out.println(counter);
    }
}