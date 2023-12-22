import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String s = sc.next();
      	String t = sc.next();
        int o=0;
        for(int i =0;i<3;i++){
        	if(s.charAt(i)==t.charAt(i)){
            	o++;
            }
        }
        System.out.println(o);
    }
}