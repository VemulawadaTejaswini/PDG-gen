
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();


int num=Integer.parseInt(nyu[0]);
int numnext=Integer.parseInt(nyu[1]);


int count=(num+numnext)/2;
if(count*2==(num+numnext)){
System.out.println(count);

}else{
System.out.println("IMPOSSIBLE");

}



//System.out.println(count);

//System.out.println(a/b);


	}
}