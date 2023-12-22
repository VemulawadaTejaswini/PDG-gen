import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                StringBuffer datestr = new StringBuffer();
                datestr.append(sc.next()); 
                datestr.replace(0,4,"2018");
		System.out.println(datestr);
	}
}