import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<k; i++){
            for(int j=0; j<s.length()-i; j++){
                set.add(s.substring(j, j+i+1));
            }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list.get(k-1));
    }
}
