import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String pattern = input.nextLine().toUpperCase();
        String word = input.nextLine().toUpperCase();
        String new_word = null;
        while(input.hasNextLine()){
            new_word = input.nextLine().toUpperCase();
            if(word.compareTo("END_OF_TEXT") == 0)
                break;
            word += (" " + new_word);
        }
        String[] words = word.split("\\s");
        int cnt = 0;
        for (int i = 0; i < words.length; i ++){
            if(words[i].compareTo(pattern) == 0)
                cnt ++;
        }
        System.out.println(cnt);
    }
}
