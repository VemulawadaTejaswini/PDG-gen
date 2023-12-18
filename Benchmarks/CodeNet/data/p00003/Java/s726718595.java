import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
    	 Scanner sc = new Scanner(System.in);
    	 sc.useDelimiter("\\n");//
    	 int setOfData = 0;// データセット数
    	 
         while(sc.hasNext()) {
        	 String str = sc.nextLine();
        	 String[] splitted = str.split(" ");// 空白で文字列を分割する
        	 int length = splitted.length;// 要素の数
        	 if(length == 1) { // データセット数
        		 setOfData = numOfSet(splitted); // データセット数をセットする
        	 } else if(length == 3) { // 三角形の三辺
        		 if(isRightAngle(splitted)) {
            		 System.out.println("YES");
            	 } else {
            		 System.out.println("NO");
            	 }        		 
        	 } else { // それ以外（現状は無視）
        		 
        	 }
         }
    	if (sc.ioException() != null) {
    	    throw sc.ioException();
    	}
    	
    }
    /** データセット数を取得するメソッド */
    public static int numOfSet(String[] string) {
    	return Integer.valueOf(string[0]);
    }
    
    /** 直角三角形かどうかを判断するメソッド */
    public static Boolean isRightAngle(String[] string) {
    	int x = Integer.valueOf(string[0]);
    	int y = Integer.valueOf(string[1]);
    	int z = Integer.valueOf(string[2]);
    	x = x*x;
    	y = y*y;
    	z = z*z;
    	
    	if(x == y+z || y == x+z || z == x+y) {
    		return true;
    	} else {
    		return false;
    	}
    }
}