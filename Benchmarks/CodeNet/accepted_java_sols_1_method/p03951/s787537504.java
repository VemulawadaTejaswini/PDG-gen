import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String str1 = br.readLine();
        for(int i = 0;i < n;i++){
            boolean flag = true;
            for(int j = 0;j + i < n;j++){
                if(str1.charAt(j) == str.charAt(j + i))continue;
                flag = false;
                break;
            }
            if(flag){
                System.out.println(n + i);
                return;
            }
        }
        System.out.print(2*n);
    }
}