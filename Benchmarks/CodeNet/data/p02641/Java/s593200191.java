import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int x=sc.nextInt(),n=sc.nextInt(),min=Integer.MAX_VALUE,res=0;
	  Set<Integer> set=new TreeSet<>();
	  for(int i=0;i<n;i++)set.add(sc.nextInt());
	  if(set.contains(x)) {
		 for(int i=-100;i<=100;i++) {
			 if(set.contains(i))continue;
			 if(min>Math.abs(x-i)) {
				 res=i;
				 min=x-i;
			 }
		 }
		 System.out.println(res);
	  }else {
		  System.out.println(x);
	  }
  }
}

