import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String a[]= s.split(" ");
        int t[] = new int[2];
        t[0] = Integer.parseInt(a[0]);
        t[1] = Integer.parseInt(a[1]);
        
        if (t[0] > t[1]){
            System.out.println(t[0] + " > " + t[1]);
        }else if (t[0]==t[1]){
            System.out.println(t[0] + " = " + t[1]);
        }else{
            System.out.println(t[0] + " < " + t[1]);
        }
    }
}