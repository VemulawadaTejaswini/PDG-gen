import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String strDate = sc.next();
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        Date targetDate = new Date();;
        try {
        	date = sdFormat.parse(strDate);
        	targetDate = sdFormat.parse("2019/04/30");
        }catch(Exception e){

        }

        String msg = "Heisei";
        if(date.after(targetDate)) {
        	msg = "TBD";
        }
        System.out.println(msg);
	}

}
