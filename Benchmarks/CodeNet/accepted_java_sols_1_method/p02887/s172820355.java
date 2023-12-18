import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        // 宣言
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        ArrayList<String> strs = new ArrayList<>();
        
        int index = 0;
        // 入力値取得
        int n = sc.nextInt();
        String colInfo = sc.next();
        
        // 文字数 > 1の場合は比較処理をする
        if(colInfo.length() > 1){
            for(int i=0;i<n-1;i = index){
                for(int j=index;j<n-1;j++){
                    if(colInfo.charAt(i) != colInfo.charAt(j+1)){
                        break;
                    }
                    ++index;
                }
                ++index;
                strs.add(colInfo.substring(i,index));
            }
            if(colInfo.charAt(n-1) != colInfo.charAt(n-2)){
                strs.add(colInfo.substring(index,colInfo.length()));            
            }
            System.out.println(strs.size());
        }else{
            System.out.println(1);
        }
    }
}
