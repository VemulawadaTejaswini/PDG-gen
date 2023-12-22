import java.util.*;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int n,m;

	String str;

	List<Integer> list = new LinkedList<Integer>();

	while(scan.hasNext()){
	    n = scan.nextInt();
	    m = scan.nextInt();
	    str = String.valueOf(n+m);
 	    list.add(str.length());
 	}

	for(Iterator<Integer> it = list.iterator(); it.hasNext();){
	    System.out.println(it.next());
	}
     }
 }