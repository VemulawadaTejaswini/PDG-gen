import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner("10\r\n10\r\n5\r\n9\r\n8\r\n10\r\n4\r\n7\r\n4\r\n5\r\n7");
        
        // もちの数
        int mochiNum = sc.nextInt();
        
        // 直系の重複をしないもちリストの初期化
        List<Integer> mochiList = new ArrayList<>();
        
        while(sc.hasNext()) {
            int diameter = sc.nextInt();
            
            // リストに同一直径のもちが存在しなければリストに追加する
            if(!mochiList.contains(diameter)) {
                mochiList.add(diameter);
            }
            
        }
        
        // もちリストの数が最大の段数
        System.out.println(mochiList.size());
    }
}
