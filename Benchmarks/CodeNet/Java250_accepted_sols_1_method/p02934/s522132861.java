import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();

	double bunsi=0;
   	for(int i=0;i<N;i++)bunsi+=(1000.0/sc.nextInt());
	System.out.println(1000/bunsi);
 }
}
