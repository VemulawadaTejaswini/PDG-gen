import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String words, sentence;
        words = scan.next().toUpperCase();
        sentence = scan.next();
        int result=0;
        
        while(!sentence.equals("END_OF_TEXT")){
            if(sentence.toUpperCase().equals(words))
                result++;
            sentence=scan.next();
        }
        
            System.out.println(result);
    }
}
