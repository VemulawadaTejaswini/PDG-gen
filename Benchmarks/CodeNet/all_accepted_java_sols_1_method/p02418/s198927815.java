import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String words, sentence;
        sentence = scan.next();
        words = scan.next();
        int result;
        
        sentence+=sentence;
        if(sentence.indexOf(words)!=-1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
