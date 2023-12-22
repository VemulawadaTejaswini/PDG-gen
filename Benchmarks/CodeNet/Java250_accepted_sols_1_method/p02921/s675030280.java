
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      String[] nyu=sc.nextLine().split("");
      String[] nyureal=sc.nextLine().split("");


//int num=Integer.parseInt(sn[0]);
//int num2=Integer.parseInt(sn[1]);

int count=0;

for(int i=0;i<nyu.length;i++){
if(nyu[i].equals(nyureal[i])){
count++;
}
}




System.out.println(count);

//System.out.println(a/b);


	}
}