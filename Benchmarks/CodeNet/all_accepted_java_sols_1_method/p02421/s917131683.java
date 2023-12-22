import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++){
            String word1 = sc.next();
            String word2 = sc.next();
            if(word1.compareTo(word2) > 0){
                count1 += 3;
            }else if(word1.compareTo(word2) < 0){
                count2 += 3;
            }else{
                count1 += 1;
                count2 += 1;
            }
        }
        System.out.println(count1 + " " + count2);
    }
}
