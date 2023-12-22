//package AtCoder;
import java.util.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long h=sc.nextLong();
		long attack=0;
		int k=0;
		while(h>1)
		{
			h=h/2;
			attack+=(long)Math.pow(2,k);
			k++;
		}
		attack=(long) (attack+Math.pow(2,k));	
		System.out.println(attack);
	}

}
