import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 標準入力から取得
        Scanner scan = new Scanner(System.in);
        // 取得した文字を格納する可変長リスト
        ArrayList<String> scList = new ArrayList<>();
        
        for (int i = 0; i >= 0; i++) {
            try {
                // 可変長リストに標準入力の値を格納
                scList.add(scan.nextLine());
            } catch (Exception e) {
                break;
            }
        }
        
        Set<String> gacha = new HashSet<String>();
        
        for (int i = 0; i < scList.size(); i++) {
            if (i != 0) {
                gacha.add(scList.get(i));
            }
        }
        System.out.println(gacha.size());
    }
}