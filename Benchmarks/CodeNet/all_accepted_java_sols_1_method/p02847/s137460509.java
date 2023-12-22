import java.util.*;
import java.io.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
        //コード
      	Scanner sc = new Scanner(System.in);
      	String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
      	
      	String str = sc.next();
      
      	for (int i = 0; i < 7; i++) {
          	if(week[i].equals(str)) {
              	System.out.println(7-i);
              	System.exit(0);
            }
        }
    }
}