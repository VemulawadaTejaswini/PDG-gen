
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();

int A=Integer.parseInt(nyu[0]);
int B=Integer.parseInt(nyu[1]);

String ny[]=sc.nextLine().split("");

for(int i=0;i<ny.length;i++){
if(i==B-1){
System.out.print(ny[i].toLowerCase());
}else{
System.out.print(ny[i]);
}

}

	}
}