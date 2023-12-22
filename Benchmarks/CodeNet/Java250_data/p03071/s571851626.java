import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        
        int buttonA = Integer.parseInt(line[0]);
        int buttonB = Integer.parseInt(line[1]);

        int ans = 0;
        if(buttonA > buttonB){
            ans += buttonA;
            buttonA--;
        }else{
            ans += buttonB;
            buttonB--;
        }

        if(buttonA > buttonB){
            ans += buttonA;
        }else{
            ans += buttonB;
        }

        System.out.println(ans);
    }
}
