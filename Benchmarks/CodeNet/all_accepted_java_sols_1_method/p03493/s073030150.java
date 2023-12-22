import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String numStr = sc.next();
        char[] numChar = new char[numStr.length()];

        for(int i = 0; i<numStr.length(); i++){
            numChar[i] = numStr.charAt(i);
        }

        int count = 0;
        for(int j = 0; j<numStr.length(); j++){
            if(numChar[j] == '1'){
                count++;
            }
        }

        System.out.println(count);
    }
}