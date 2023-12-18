import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
      long a=sc.nextLong();
      long b=sc.nextLong();
      long c=sc.nextLong();
      long d=sc.nextLong();
      long product=0;
      long product1=a*c;
      long product2=a*d;
      long product3=b*c;
      long product4=b*d;
      product=Math.max(product1,(Math.max(product2,Math.max(product3,product4))));
      System.out.println(product);
	}
}