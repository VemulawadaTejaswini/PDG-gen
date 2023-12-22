import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String previousWord = "";
        String nextword = "~";
        boolean isYes = true;

        Map resultMap = new HashMap();

        for(int i = 0; i<N; i++){

            nextword = sc.next();
            if(previousWord == ""){
                previousWord = nextword.substring(0,1);
            }

            if(previousWord.charAt(previousWord.length()-1) != nextword.charAt(0)){
                isYes = false;
                break;
            }
            if(resultMap.containsKey(nextword)){
                isYes = false;
                break;
            }
            resultMap.put(nextword,"");
            previousWord = nextword;
        }

        if(isYes){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}