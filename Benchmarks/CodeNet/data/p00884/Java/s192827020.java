import java.util.*;

public class Main {
	public static HashMap<String,HashSet<String>> map;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			map = new HashMap<String, HashSet<String>>();
			String first = null;
			for(int i=0;i<n;i++){
				String[] s = sc.next().split(":");
				if(i == 0) first = s[0];
				s[1] = s[1].replaceAll("\\.", "");
				String[] ss = s[1].split(",");
				map.put(s[0], new HashSet<String>());
				for(String tmp : ss){
					map.get(s[0]).add(tmp);
				}
			}

			for(String si : map.keySet()){
				for(String sj : map.keySet()){
					if(map.get(si).contains(sj)){
						map.get(si).remove(sj);
						map.get(si).addAll(map.get(sj));
					}
					if(map.get(sj).contains(si)){
						map.get(sj).remove(si);
						map.get(sj).addAll(map.get(si));
					}
				}
			}

			System.out.println(map.get(first).size());
		}
	}
/*
	public static HashSet<String> solve(String group){
		for(String s : map.get(group)){

		}

	}
	*/
}