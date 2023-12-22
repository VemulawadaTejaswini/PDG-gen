import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> array = new ArrayList();
        ArrayList<Integer> iniArray = new ArrayList();
        for(int i=0; i<num; i++){
            array.add(sc.nextInt());
            iniArray.add(0);
        }

        int count = 0;

        for(int i=0; i<num-1; i++){

            while(iniArray.get(i) < array.get(i)){
                count++;
                int start = i;
                int end = num-1;
                for(int j=i+1; j<num; j++){
                    if(iniArray.get(j) >= array.get(j)) {
                        end = j-1;
                        break;
                    }
                }

                for(int k=start; k<=end; k++){
                    iniArray.set(k, iniArray.get(k) + 1);
                }
            }
        }

        if (iniArray.get(num-1) < array.get(num-1)) {
            count = count + (array.get(num-1) - iniArray.get(num-1));
            iniArray.set(num-1, array.get(num-1));
        }

//        System.out.println(iniArray);
        System.out.println(count);
    }
}
