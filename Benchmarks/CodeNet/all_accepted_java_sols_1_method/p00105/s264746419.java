import java.util.*;

public class Main{
    Main(){
	Scanner sc = new Scanner(System.in);
	TreeMap<String, Vector<Integer>> map = new TreeMap<String, Vector<Integer>>(); 

	while(sc.hasNext()){
	    String str = sc.next();
	    Integer tmp = Integer.valueOf(sc.next());
	    Vector<Integer> vec;
	    if(map.containsKey(str)){
		vec = map.get(str);
		map.remove(str);
	    } else {
		vec = new Vector<Integer>();
	    }
	    vec.add(tmp);
	    map.put(str, vec);
	}

	for(Iterator it = map.keySet().iterator(); it.hasNext();){
	    String str = (String)it.next();
	    Vector<Integer> vec = map.get(str);
	    Collections.sort(vec);
	    System.out.println(str);
	    System.out.print((vec.get(0)).toString());
	    for(int i = 1; i < vec.size(); i++)
		System.out.print(" " + (vec.get(i)).toString());
	    System.out.println();
	}
    }

    public static void main(String[] args){
	new Main();
    }
}