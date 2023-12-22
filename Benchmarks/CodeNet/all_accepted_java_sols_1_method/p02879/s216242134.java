
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] sn=sc.nextLine().split(" ");
int num=Integer.parseInt(sn[0]);
int num2=Integer.parseInt(sn[1]);

if(0<num && num<10 && 0<num2 && num2<10){
System.out.println(num*num2);

}else{

System.out.println(-1);
}

	}
}