//package hiougyf;
import java.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
		 int n=sc.nextInt();
		 int m=sc.nextInt();
		 long k=sc.nextInt();
		 Queue<Long> a=new LinkedList<>();
		 Queue<Long> b=new LinkedList<>();
		 for(int i=0;i<n;i++) a.add(sc.nextLong());
		 for(int i=0;i<m;i++) b.add(sc.nextLong());
		 boolean f=true;
		 int ans=0;
		 while(a.size()!=0&&b.size()!=0) {
			// System.out.println("asd");
			 if(a.peek()<=b.peek()) {
				 if(k>=a.peek()) {
					 k-=a.poll();
				//	 System.out.println(k+"d");
					 ans++;
					 continue;
				 }
				 else {
					 f=false;
					 break;
				 }
			 }
			 if(a.peek()>b.peek()) {
				 if(k>=b.peek()) {
					 k-=b.poll();
					 ans++;
					//System.out.println(k+"fd");
					 continue;
				 }
				 else {
					 f=false;
					 break;
				 }
			 }
		 }
		  if(f==false) {
			  System.out.println(ans);
		  }
		  else {
			  while(!a.isEmpty()) {
				  if(k>=a.peek()) {
					  k-=a.poll();
					  ans++;
					//  System.out.println(k+"td");
					  
				  }
				  else {
					  System.out.println(ans);
					  f=false;
					  break;
				  }
			  }
			  while(!b.isEmpty()) {
				  if(k>=b.peek()) {
					  k-=b.poll();
					  ans++;
					//  System.out.println(k+"tdf");
				  }
				  else {
					  f=false;
					  System.out.println(ans);
					  break;
				  }
			  }
		  }
		  if(f==true) {
			  System.out.println(ans);
		  }
		}
}
