import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 文字列の入力
		String s = sc.next();
        int l=s.length();
        String o="Yes";
        for (int i=0;2*i+1<=l;i++){	//奇数文字目
            char a=s.charAt(2*i);
            if(a=='R' || a=='U' ||a=='D' ){

            }else{
                o="No";
                break;
            }
        }
        if(o.equals("Yes")){
            for (int i=0;2*i+2<=l;i++){	//偶数文字目
                char a=s.charAt(2*i+1);
                if(a=='L' || a=='U' ||a=='D' ){

                }else{
                    o="No";
                    break;
                }
            }
        }
          // 出力
          System.out.println(o);
      }
}