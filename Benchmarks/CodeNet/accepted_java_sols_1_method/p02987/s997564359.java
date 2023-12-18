import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        HashMap<String, Integer> a = new HashMap<>();
        for(String t : str){
            if(a.containsKey(t)){
                a.put(t, a.get(t)+1);
            }
            else{
                a.put(t, 1);
            }
        }

        String result = "Yes";
        if(a.size()!=2){
            result="No";
        }
        else if(a.get(str[0]) != 2){
            result = "No";
        }
        System.out.println(result);
    }
}