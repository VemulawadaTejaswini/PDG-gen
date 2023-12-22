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
        
        String[] numlist = scList.get(0).split(" ");
        
        int Sheep = Integer.parseInt(numlist[0]);
        int Wolve = Integer.parseInt(numlist[1]);
        
        if (Wolve >= Sheep) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}