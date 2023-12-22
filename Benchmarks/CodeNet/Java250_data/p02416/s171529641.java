import java.io.*;
import java.util.*;
 
public class Main{
 
    public static void main(String[] args) {

        ArrayList<Integer> intAry = new ArrayList<Integer>();
 
        int intAnswer = 0;

        try {
            BufferedReader insBR = new BufferedReader(new InputStreamReader(System.in));
 
            while(true) {
                String strLine = insBR.readLine();

                if(strLine.equals("0")) {
                    break;
                }
 

                char[] chaAryLine = strLine.toCharArray();
 
                for(int i = 0; i < chaAryLine.length; i++) {
                    int intNum = Integer.parseInt("" + chaAryLine[i]);
 
                    intAnswer += intNum;
                }
                intAry.add(intAnswer);

                intAnswer = 0;
 
            }
            int intSize = intAry.size();

            for(int i = 0; i < intSize; i++) {
                System.out.println(intAry.get(i));
            }
 
        } catch (IOException e) {
            System.out.println(e);
        }
 
    }
}