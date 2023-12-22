import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        execute(br);
    }   

    private static void execute(BufferedReader br) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int taro = 0, hanako = 0;
        for (int i = 0; i < n; i++) {
            String[] strs = br.readLine().split(" ");
            if (strs[0].compareTo(strs[1]) > 0) {
                taro += 3;
            }   
            else if(strs[0].compareTo(strs[1]) < 0) {
                hanako += 3;   
            }   
            else if(strs[0].compareTo(strs[1]) == 0) {
                taro++;
                hanako++;
            }   
        }   
        System.out.println(taro + " " + hanako);
    }   
}