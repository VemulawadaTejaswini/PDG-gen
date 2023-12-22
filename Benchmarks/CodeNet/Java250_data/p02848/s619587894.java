import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);
      
        int x = s.nextInt();
		String y = s.next();
      
        StringBuilder sb = new StringBuilder(); //戻り値
      
        //System.out.println("length= " + y.length());
        
        for (int i=0; i<y.length();i++){
          if ((y.charAt(i) + x) > 90) {
            sb.append((char) (y.charAt(i) + x -26)); 
          } else {
            sb.append((char) (y.charAt(i) + x)); 
          }
        }
      
		// 戻り値の返却
		//System.out.println((char) 65); 
        System.out.println(sb); 
	
	} 
}