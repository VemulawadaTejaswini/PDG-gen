import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);

	while(sc.hasNext())
	    for(int cs = sc.nextInt(); cs > 0; cs--){
		int n = sc.nextInt(), s = sc.nextInt(), t;
		Vector<Integer> v1, v2;
		v1 = new Vector<Integer>();
		v2 = new Vector<Integer>();
		v1.add(new Integer(0));
		v2.add(new Integer(0));

		for(int i = 1; i < n; i++){
		    t = sc.nextInt();
		    if(s < t) v1.add(new Integer(t-s));
		    if(s > t) v2.add(new Integer(s-t));
		    s = t;
		}
		Collections.sort(v1);
		Collections.sort(v2);

		System.out.println(Integer.toString(v1.get(v1.size()-1))+" "+Integer.toString(v2.get(v2.size()-1)));
	    }
    }

    public static void main(String[] args){
	new Main();
    }
}