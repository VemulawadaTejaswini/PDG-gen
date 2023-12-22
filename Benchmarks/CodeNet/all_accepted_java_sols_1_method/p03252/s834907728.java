import java.util.Scanner;
import java.util.HashMap;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        String input1 = scan.next();
        String input2 = scan.next();
        char[] before = input1.toCharArray();
        char[] after = input2.toCharArray();
        HashMap<Character, Character> judge = new HashMap<>();

        // search
        String answer = "Yes";
        for(int i = 0; i < before.length; i++){
            if(!judge.containsKey(before[i])){
                judge.put(before[i], after[i]);
            } else if(judge.get(before[i]) != after[i]) {
                answer = "No";
                break;
            }
        }
        if(answer.equals("Yes")){
            judge.clear();
            for(int i = 0; i < after.length; i++){
                if(!judge.containsKey(after[i])){
                    judge.put(after[i], before[i]);
                } else if(judge.get(after[i]) != before[i]) {
                    answer = "No";
                    break;
                }
            }

        }
        
        //answer 
        System.out.println(answer);

    }
}