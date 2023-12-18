import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	long n=sc.nextLong();
    StringBuffer sb=new StringBuffer();
    while(n>0){
      long f=n%26;
      long i=1;
      for(char al='a';al<='z';al++){
        if(f==i){
          sb.append(al);
        }
        i++;
      }
      n/=26;
    }
    sb.reverse();
    System.out.println(sb);
  }
}
