import java.util.*;

public class Main{
    static HashMap<String,HashSet<String>> map;

    static HashSet<String> solve(String s){
	HashSet<String> res = new HashSet<String>();

	if(!map.containsKey(s)){
	    res.add(s);
	    return res;
	}

	for(String ns : map.get(s)){
	    HashSet<String> tmp = solve(ns);
	    res.addAll(tmp);
	}

	return res;
    }

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt();
	    if(n == 0) break;

	    map = new HashMap<String,HashSet<String>>();

	    String start = null;

	    for(int i = 0; i < n; i++){
		String[] s = sc.next().replaceAll("\\.", "").split("\\:");
		String[] ss = s[1].split("\\,");
		HashSet<String> set = new HashSet<String>();

		if(i == 0){
		    start = s[0];
		}

		for(int j = 0; j < ss.length; j++){
		    set.add(ss[j]);
		}

		map.put(s[0], set);
	    }

	    HashSet<String> ans = solve(start);

	    System.out.println(ans.size());
	}
    }
}