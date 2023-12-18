
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split(" ");
    // String nyu=sc.nextLine();

//int[] num=new int[6];

int H=Integer.parseInt(nyu[0]);
int W=Integer.parseInt(nyu[1]);

      nyu=sc.nextLine().split(" ");

int h=Integer.parseInt(nyu[0]);
int w=Integer.parseInt(nyu[1]);


//int A=Integer.parseInt(nyu[0]);
//int B=Integer.parseInt(nyu[1]);

System.out.println((H-h)*(W-w));

	}
}