import java.util.*;

class Main{
	public static void main(String[] A){
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		System.out.println(i%(i+"").chars().map(o->o-'0').sum()==0?"Yes":"No");
	}
}
