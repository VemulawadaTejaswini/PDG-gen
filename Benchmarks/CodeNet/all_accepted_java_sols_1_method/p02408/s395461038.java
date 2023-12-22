import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //枚数
        int n = Integer.parseInt(sc.next());
        
        //スペード:S
        List<Integer> s_list = new ArrayList<>();
        //ハート:H
        List<Integer> h_list = new ArrayList<>();
        //クラブ:C
        List<Integer> c_list = new ArrayList<>();
        //ダイヤ:D
        List<Integer> d_list = new ArrayList<>();
        
        //1～13の数字を登録
        for(int i=1; i<=13; i++){
            s_list.add(i);
            h_list.add(i);
            c_list.add(i);
            d_list.add(i);
        }
        
        //インプットされた値をリストから除外
        for(int i=0; i<n; i++){
            //絵柄
            String suit = sc.next();
            //数字
            int num = sc.nextInt();
            
            //リストから該当する数字を除外
            if(suit.equals("S")) s_list.remove(s_list.indexOf(num));
            else if(suit.equals("H")) h_list.remove(h_list.indexOf(num));
            else if(suit.equals("C")) c_list.remove(c_list.indexOf(num));
            else if(suit.equals("D")) d_list.remove(d_list.indexOf(num));
        }
        //リストに残った数字を出力
        for(Integer s: s_list){
            System.out.println("S "+s);
        }
        for(Integer h: h_list){
            System.out.println("H "+h);
        }
        for(Integer c: c_list){
            System.out.println("C "+c);
        }
        for(Integer d: d_list){
            System.out.println("D "+d);
        }





    }

}

