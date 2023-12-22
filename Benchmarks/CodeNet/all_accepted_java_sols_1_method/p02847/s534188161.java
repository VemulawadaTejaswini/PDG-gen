
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String sn=sc.nextLine();
String[] data={"SUN","MON","TUE","WED","THU","FRI","SAT"};

for(int i=0;i<data.length;i++){
if(sn.equals(data[i])){
System.out.println(7-i);
break;
}
}


	}
}