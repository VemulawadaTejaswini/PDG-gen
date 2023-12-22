
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
   //  String nyu=sc.nextLine();


int num=Integer.parseInt(nyu[0]);
int numnext=Integer.parseInt(nyu[1]);

int[] data=new int[3];
data[0]=num+numnext;
data[1]=num * numnext;
data[2]=num - numnext;
Arrays.sort(data);
//int num2=Integer.parseInt(sn[1]);

int count=0;





System.out.println(data[2]);

//System.out.println(a/b);


	}
}