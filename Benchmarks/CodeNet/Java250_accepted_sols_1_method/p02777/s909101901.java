import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ",0);
        String[] n = br.readLine().split(" ",0);
        int[] num = new int[2];
        num[0] = Integer.parseInt(n[0]);
        num[1] = Integer.parseInt(n[1]);
        String s = br.readLine();
        if(s.equals(str[0])){
            num[0]--;
        }else{
            num[1]--;
        }
        System.out.println(num[0] + " " + num[1]);
    }
}
