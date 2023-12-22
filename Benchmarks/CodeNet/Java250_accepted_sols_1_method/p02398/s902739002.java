import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        
        String[] ary = new String[3];
        int count = 0;
        
        ary = br.readLine().split(" ");
        int a = Integer.parseInt(ary[0]);
        int b = Integer.parseInt(ary[1]);
        int c = Integer.parseInt(ary[2]);
        
        for(int i = a; i <= b; i++){
            if(c % i == 0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}