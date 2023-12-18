import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//文字列入れ替え、逆順に表示、文字列を配列にひとつずつcharに
public class Main {

    public static void main(String[] args) throws IOException {
        // TODO 自動生成されたメソッド・スタブ
        BufferedReader  br = new  BufferedReader(new InputStreamReader(System.in));

        String inputStr = br.readLine();
        int num = Integer.parseInt(br.readLine());

        for(int i = 0;i < num;i++){
            String[] input = br.readLine().split(" ");
            int beginIndex = Integer.parseInt(input[1]);
            int endIndex = Integer.parseInt(input[2]);

            switch(input[0]){
            case "print":
                System.out.println(inputStr.substring(beginIndex,endIndex+1));
                break;
            case "reverse":
                int cycle = (endIndex - beginIndex)/2;
                char[] inputChar = inputStr.toCharArray();
                for(int j = 0 ;j <= cycle ;j++){
                    char tmp = inputStr.charAt(beginIndex + j);
                    inputChar[beginIndex + j] = inputChar[endIndex - j];
                    inputChar[endIndex - j] = tmp;
                }
                inputStr = String.valueOf(inputChar);
                break;
            case "replace":
                StringBuilder sb = new StringBuilder(inputStr);
                sb.replace(beginIndex, endIndex + 1, input[3]);
                inputStr = sb.toString();
                break;
            }
        }

    }

}

