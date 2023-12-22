import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),res=0;
    int old=sc.nextInt();
    res=old;
    for(int i=1;i<n;i++) {
    	int now=sc.nextInt();
    	res+=Math.max(0, now-old);
    	old=now;
    }
    System.out.println(res);
  }
}
