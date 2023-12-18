import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> vote = new HashMap<>();
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            String name = sc.next();
            if(vote.containsKey(name)){
                int temp = vote.get(name);
                vote.remove(name);
                vote.put(name,temp+1);
            }
            else{
                vote.put(name,1);
            }
        }
        int max = 0;
        for(String s:vote.keySet()){
            max = Math.max(max,vote.get(s));
        }
        ArrayList<String> names = new ArrayList<>();

        for(String s:vote.keySet()){
            if(vote.get(s)==max) names.add(s);
        }
        Collections.sort(names);

        for(String s:names) System.out.println(s);
    }

}


