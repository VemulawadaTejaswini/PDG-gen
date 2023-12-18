import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str, ing, ing2, p, order, ans;
    int a, b, q, i;
    str = sc.next();
    ing = "";
    ing2 = "";
    ans = "";
    q = sc.nextInt();
    
    for(i=0;i<q;i++){
        order = sc.next();
        a = sc.nextInt();
        b = sc.nextInt();
        
        if(order.equals("print")){//order=print：aからbまでを出力させる
            ans = str.substring(a,b+1);
            System.out.println(ans);
        }
        else if(order.equals("reverse")){//order=reverse：aからbまでの範囲を反転させたものを埋め込み，strに返す
            /*StringBuffer sb = new StringBuffer(str.substring(a, b+1));
            str = str.substring(0, a) + sb.reverse() + str.substring(str.length()-(b-a));
            System.out.println(str);*/
            ing = str.substring(a,b+1);
            ing2 = "";
            for(int j = ing.length()-1; j>=0; j--){
                ing2 += String.valueOf(ing.charAt(j));
            }
            str = str.substring(0,a) + ing2 + str.substring(b+1,str.length());
        }
        else if(order.equals("replace")) {//order=replace：aからbの範囲に受け取った文字pを埋め込み，strに返す
            p = sc.next();
            /*str = str.replaceFirst(str.substring(a,b+1), p);
            System.out.println(str)*/
            str = str.substring(0,a) + p + str.substring(b+1,str.length());
        }
    }
    }
    }
