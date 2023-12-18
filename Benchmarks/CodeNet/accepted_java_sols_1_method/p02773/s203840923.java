import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String curr;
        TreeMap<String,Integer> hm=new TreeMap<>();
        int currMax = 0;
        for (int i = 0; i < n; i++){
            curr = sc.nextLine();
            if(!hm.containsKey(curr)){
                hm.put(curr,1);
            } else{
                hm.put(curr, hm.get(curr)+1);
            }
            if(hm.get(curr)>=currMax)
                currMax = hm.get(curr);
        }
        for(Map.Entry e:hm.	entrySet()){
            if((int)e.getValue()==currMax)
                System.out.println(e.getKey());

        }




    }
}
