import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<3;++i) a.add(sc.nextInt());
		Collections.sort(a);
		int i=0;
		for(Iterator it=a.iterator();it.hasNext();)
			System.out.printf("%d"+((++i==3)?"\n":" "),it.next());
	}
}