import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //変数定義
        int h,m;
        String str,str1,tmp;
        StringBuffer sb;

        while(true){
            //カードの山文字列受取
            str = sc.nextLine();

            //終了条件定義
            if(str.equals("-")) break;
            
            //シャッフル回数受取
            str1 = sc.nextLine();
            m = Integer.parseInt(str1);

            //Stringクラス→StringBufferクラス
            sb = new StringBuffer(str);

            for(int i = 0;i < m;i++){
                //h受取
                str1 = sc.nextLine();
                h = Integer.parseInt(str1);
                //文字列分割
                tmp = sb.substring(0,h);
                //末尾に文字列追加
                sb.append(tmp);
                //頭の文字列削除
                sb.delete(0,h);
            }
            System.out.println(sb);
        }
    }
}
