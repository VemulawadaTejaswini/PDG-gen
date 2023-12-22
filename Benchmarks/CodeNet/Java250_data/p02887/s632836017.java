import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //入力値を設定する
        Integer numSlime = sc.nextInt();
        String slimeColor = sc.next();
        //スライムの色を一匹ずつ格納する
        List<String> colors = Arrays.asList(slimeColor.split(""));
        
        // スライムの数。必ず1匹以上いる条件であるため初期値を1とする
        Integer cnt = 1;
        
        for (int i = 0; i < numSlime; i++) {
            //1つ前の文字（色）と同じでなければ融合しないため、スライム数のカウントを1増加させる
            if(i > 0 && !colors.get(i).equals(colors.get(i - 1))) {
                cnt++;
            }
        }
        
        //出力する
        System.out.println(cnt);
    }    
}