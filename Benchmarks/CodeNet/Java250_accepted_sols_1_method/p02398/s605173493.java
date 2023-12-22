import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] line_ = line.split(" ");
        Integer i1 = Integer.valueOf(line_[0]);
        Integer i2 = Integer.valueOf(line_[1]);
        Integer i3 = Integer.valueOf(line_[2]);
        int counter = 0;
        for(int a = i1 ; a <= i2 ; a++ ) {
            if(i3 % a == 0)
            counter++;
        }
        System.out.println(counter);
    }
}