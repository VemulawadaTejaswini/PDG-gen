
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    //  String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();

int[] num=new int[6];

for(int i=0;i<6;i++){
num[i]=Integer.parseInt(sc.nextLine());
}

if(num[4]-num[0]<num[5]+1){
System.out.println("Yay!");

}else{
System.out.println(":"+"(");

}


//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);



	}
}