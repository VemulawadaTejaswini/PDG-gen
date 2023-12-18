import java.util.*;
import java.text.SimpleDateFormat;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
          Date date = format.parse(sc.next());
          Date last = format.parse("2019/04/30");
    
		  // 出力
		  System.out.println(date.after(last) ? "TBD" : "Heisei");
        } catch (Exception e) {
        }
	}
}