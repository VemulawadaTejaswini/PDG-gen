import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int turn = Integer.parseInt(br.readLine());
        int taro=0,hanako=0;
        for(int i=0;i<turn;i++) {
            String[] line2 = br.readLine().split(" ");
            //引き分け
            if(line2[0].compareTo(line2[1]) == 0){
                taro++;
                hanako++;
            }
            else if(line2[0].compareTo(line2[1]) > 0){
                taro += 3;
            }
            else {
                hanako += 3;
            }
        }
        System.out.println(taro + " " + hanako);
    }
}