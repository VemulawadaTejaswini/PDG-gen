
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
  //    String[] nyu=sc.nextLine().split(" ");

     String nyu=sc.nextLine();
//int[] num=new int[6];
//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);
//int C=Integer.parseInt(nyu);
//double A=Double.parseDouble(nyu[0]);
//double B=Double.parseDouble(nyu[1]);
/*
switch(C){
case 7:
case 5:
case 3:
System.out.println("YES") ;
break;
default:
System.out.println("NO") ;

break;
}
*/

nyu=nyu.replaceAll("1","e");
nyu=nyu.replaceAll("9","g");
nyu=nyu.replaceAll("e","9");
nyu=nyu.replaceAll("g","1");


System.out.println(nyu) ;

	}
}