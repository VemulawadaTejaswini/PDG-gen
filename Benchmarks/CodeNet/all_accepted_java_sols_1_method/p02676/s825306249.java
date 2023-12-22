import java.util.*;
class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    // 99の長さの "_" を作る
	String repeated = new String(new char[99]).replace("\0", "_");
	String v = s + repeated; // s の後ろに "_" を99個連結する。
	String x = v.substring(k,k+1); // 数値 k + 1番目の文字列を取り出す
	if("_".equals(x)){ // k + 1 番目が _ であれば s のまま出力
		System.out.println( s );
	}else{
        String r = s.substring(0,k); 
		System.out.println( r + "..."  );
	}
  }
}
