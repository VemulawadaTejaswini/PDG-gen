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
        
        int numA = Integer.parseInt(numlist[0]);
        int numB = Integer.parseInt(numlist[1]);
        int numC = Integer.parseInt(numlist[2]);
        int numD = Integer.parseInt(numlist[3]);
        
        for (int i = 0; i >= 0; i++) {
            numC = numC - numB;
            if(numC <= 0) {
                System.out.println("Yes");
                break;
            }
            numA = numA - numD;
            if (numA <= 0) {
                System.out.println("No");
                break;
            } 
        } 
    }
}