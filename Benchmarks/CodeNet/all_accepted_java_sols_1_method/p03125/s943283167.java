
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");

  //   String nyu=sc.nextLine();
//int[] num=new int[6];
int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);
//int C=Integer.parseInt(nyu[2]);


if(B%A==0){

System.out.println(A+B) ;
}else{
System.out.println(B-A) ;

}
	}
}