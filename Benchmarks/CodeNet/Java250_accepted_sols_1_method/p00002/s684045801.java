import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO ?????????????????????????????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String tmpStr = br.readLine();
            if(tmpStr == null){
                break;
            }

            String[] tmpArray = tmpStr.split(" ");

            int num1 = Integer.parseInt(tmpArray[0]);
            int num2 = Integer.parseInt(tmpArray[1]);

            int sum = num1 + num2;

            System.out.println(Integer.toString(num1 + num2).length());
        }


    }

}