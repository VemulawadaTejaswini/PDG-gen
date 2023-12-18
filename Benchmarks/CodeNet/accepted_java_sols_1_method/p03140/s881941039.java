import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),sum=0;
    String a=sc.next(),b=sc.next(),c=sc.next();
    Set<String> set = new HashSet<>();
    for(int i=0;i<n;i++) {
    	set.add(a.substring(i, i+1));
    	set.add(b.substring(i, i+1));
    	set.add(c.substring(i, i+1));
    	sum+=set.size()-1;
    	set.clear();
    }
    System.out.println(sum);
  }
}
