import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); long r=0;
	LinkedList<Integer> stok = new LinkedList<Integer>();
	stok.add(Integer.MAX_VALUE);
    for(int i=1;i<n;i++){
		stok.add(sc.nextInt());
		r+=Math.min(stok.get(0),stok.get(1));
		stok.remove(0);
	}
	System.out.println(r+stok.get(0));
 }
}