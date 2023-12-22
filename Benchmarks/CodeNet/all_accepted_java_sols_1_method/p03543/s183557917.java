
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
//     String[] nyu=sc.nextLine().split(" ");

     String nyu=sc.nextLine();
//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);
//int C=Integer.parseInt(nyu[2]);
//int D=Integer.parseInt(nyu[3]);


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

//int res=Math.min((A*B),C);

//for(String tem:nyu){
//if(tem.equals("1"))res++;
//}

if(nyu.contains("111") || nyu.contains("222") ||
nyu.contains("333") ||  nyu.contains("444") ||
nyu.contains("555") || nyu.contains("666") || 
nyu.contains("777") || nyu.contains("888") || 
nyu.contains("999") || nyu.contains("000")   ){
//double res=Math.ceil((AB)/2);

System.out.println("Yes");
//}else if(A+B>C+D){
//System.out.println("Left");

}else{
System.out.println("No");

}




	}
}