import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
        Dice dice = new Dice(s);
        char[] arr = br.readLine().toCharArray();
        for(int i=0; i<arr.length; i++){
            dice.roll(arr[i]);
        }
        System.out.println(dice.getTop());
    }
}

class Dice {
    
    private String top;
    private String sideS;
    private String sideE;
    private String sideW;
    private String sideN;
    private String bottom;
    
    Dice(String[] arr){
        top = arr[0];
        sideS = arr[1];
        sideE = arr[2];
        sideW = arr[3];
        sideN = arr[4];
        bottom = arr[5];
    }
    
    void roll(char s) {
        if (s == 'S'){
            String tmp = bottom;
            bottom = sideS;
            sideS = top;
            top = sideN;
            sideN = tmp;
        } else if (s == 'E'){
            String tmp = bottom;
            bottom = sideE;
            sideE = top;
            top = sideW;
            sideW = tmp;
        } else if (s == 'W'){
            String tmp = bottom;
            bottom = sideW;
            sideW = top;
            top = sideE;
            sideE = tmp;
        } else if (s == 'N'){
            String tmp = bottom;
            bottom = sideN;
            sideN = top;
            top = sideS;
            sideS = tmp;
        }
    }
    
    String getTop() {
        return top;
    }
}
