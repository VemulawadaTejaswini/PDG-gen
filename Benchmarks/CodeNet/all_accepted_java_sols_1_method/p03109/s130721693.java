
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//      String[] nyu=sc.nextLine().split(" ");
String[] data=new String[2];
data[0]="2019/04/30";

  //   String nyu=sc.nextLine();
data[1]=sc.nextLine();
//int[] num=new int[6];
Arrays.sort(data);
//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);
//int C=Integer.parseInt(nyu[2]);



//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);

if(data[1].equals("2019/04/30")){

System.out.println("Heisei") ;
}else{
System.out.println("TBD") ;

}
	}
}