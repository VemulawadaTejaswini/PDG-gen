import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n = sc.nextInt();
  	ArrayList<Integer> a = new ArrayList<Integer>();
  	for(int i=0;i<n;++i)a.add(sc.nextInt());
  	Collections.sort(a);
  	for(int i=0;i<n;++i) System.out.printf("%d"+((i==n-1)?"\n":" "),a.get(i));
  }
}