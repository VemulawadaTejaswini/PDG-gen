import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] answers = {1,2,3};
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for(int i = 0; i<answers.length; i++){
            if(answers[i] != a && answers[i] != b){
                System.out.println(answers[i]);
            }
        }
    }
}
