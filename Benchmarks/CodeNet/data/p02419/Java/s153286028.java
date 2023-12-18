import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String inputWord = "";
        inputWord = sc.next().toLowerCase();
        
        String inputWriting = "";
        int count = 0;
        while(!((inputWriting = sc.next()).equals("END_OF_TEXT"))){
            if(inputWriting.toLowerCase().equals(inputWord)){
                count++;
            }
        }
        System.out.println(count);
    }
}
