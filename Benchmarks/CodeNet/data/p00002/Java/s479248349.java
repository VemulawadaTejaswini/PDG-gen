import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
    	 Scanner sc = new Scanner(System.in);
    	 sc.useDelimiter("\\n");//
    	 
         while(sc.hasNext()) {
        	 String str = sc.nextLine();
        	 String[] splitted = str.split(" ");// 空白で文字列を分割する
        	 System.out.println(getDigit(getSum(splitted)));
         }
    	if (sc.ioException() != null) {
    	    throw sc.ioException();
    	}
    	
    }
    
    /** 文字列から、和を求めるメソッド */
    public static int getSum(String[] string) {
    	int x = Integer.valueOf(string[0]);
    	int y = Integer.valueOf(string[1]);
    	
    	return x+y;
    }
    
    /** 与えられた整数の桁数を取得するメソッド */
    public static int getDigit(int num) {
    	String str = String.valueOf(num);
    	return str.length();
    }
}