
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String s=sc.nextLine();

int a=Integer.parseInt(s);
      String[] sn=sc.nextLine().split(" ");
String[] mae=sn[0].split("");      
String[] usi=sn[1].split("");      


String result="";

for(int i=0;i<a;i++){
result+=mae[i];
result+=usi[i];

}


System.out.println(result);



	}
}