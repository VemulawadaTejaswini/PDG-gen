        import java.util.Scanner;
        public class Main {
        	 public static void main(String args[]){
        	Scanner scanner = new Scanner(System.in);
        	
        	String a=scanner.next();
        	String b=scanner.next();
               int n=0;
        	// 変数strの長さ分回す
        	for (int i = 0; i < a.length(); i++) {
        	    // strの先頭から1文字ずつString型にして取り出す
        	    String str1 = String.valueOf(a.charAt(i));
        	    String str2 = String.valueOf(b.charAt(i));
        	    if(!(str1.equals(str2))){
        	    	n=n+1;
                }}
        	   System.out.println(n);
         
        	}
        }