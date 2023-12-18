import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args) throws ParseException{
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
      	String S = sc.next();
      	String S2 = "2019/05/01";
      	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
      	 Date formatDate = sdf.parse(S); 
      Date formatDate2 = sdf.parse(S2);
      	
      	
      	boolean result = formatDate2.after(formatDate);
      	if(!result){
	        System.out.println("TBD");
        }else{
        	System.out.println("Heisei");
        }
      	
      
    }
}