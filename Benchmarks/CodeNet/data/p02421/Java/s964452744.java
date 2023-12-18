import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int taroPoint = 0;
        int hanakoPoint = 0;

        for(int i = 0; i < n; i++){

            String input = br.readLine();
            String[] card = input.split(" ");

            String taro = card[0];
            String hanako = card[1];

            if(taro.compareTo(hanako) > 0){
                taroPoint += 3;
            }else if(taro.compareTo(hanako) < 0){
                hanakoPoint += 3;
            }else{
                taroPoint++;
                hanakoPoint++;
            }
        }
        sb.append(taroPoint).append(" ").append(hanakoPoint);
        System.out.println(sb);
    }
}