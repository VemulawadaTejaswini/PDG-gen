import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String aaa = br.readLine();
        int num5 = Integer.parseInt(aaa);
            
        CalcAdd calcAdd = (num) -> {
            return num * num * num;
        };
        System.out.println(calcAdd.calc(num5));
    }
}

interface CalcAdd{
    int calc(int num);
}


