import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

// メインクラス
public class Main {
    // メインメソッド
    public static void main(String[] args) throws IOException {
        ArrayList<String> dataSet = inputDataSet("0"); // データセットを読み込む
        
        // 全てのデータセットに対し、処理を行う
        for(String line : dataSet){
            int n = Integer.parseInt(line);
        
            removeUnluckyNumber.showConvNum(n, 1); // 変換した数字を表示する
            System.out.println();
        }
    }
    
    // データセットを1行毎に格納したリストを返すメソッド
    // 入力の終端か、データセットの終端を示すterminalに達するまで読み込む
    public static ArrayList<String> inputDataSet(String terminal) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> dataSet = new ArrayList<String>();
        while(true){
            String line = br.readLine();
            if(line == null || line.equals(terminal))break;
            dataSet.add(line);
        }
        
        return dataSet;
    }
}

// 忌み数除去クラス
class removeUnluckyNumber{
    // 1桁(0~8)の変換表
    private static int[] convTable = {0, 1, 2, 3, 5, 7, 8, 9};
    
    //再帰により変換後の番号を1文字づつ表示していくメソッド
    public static void showConvNum(int n, int d){
        if(n == 0 || d > 10)return; // nが0になったか、深さが10を超えた場合、終了
        
        showConvNum(n >> 3, d + 1); // nを8で割り、再帰呼び出し
        System.out.print(convTable[n & 7]); // 8進数下1桁を変換して出力
    }
}

