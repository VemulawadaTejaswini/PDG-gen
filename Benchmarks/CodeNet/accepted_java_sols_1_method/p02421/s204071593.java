import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int taro = 0;
        int hanako = 0;
        for (int i = 0; i < n; i++){
            String[] cards = br.readLine().split(" ");
            if (cards[0].compareTo(cards[1])>0){
                taro += 3;
            }else if (cards[0].compareTo(cards[1])==0){
                taro += 1;
                hanako += 1;
            }else{
                hanako += 3;
            }
        }
        System.out.println(taro + " " + hanako);
    }
}