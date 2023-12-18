import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<String, Integer> dic = new TreeMap<>();
        int N = sc.nextInt();
        sc.nextLine();
        int max = 0;

        for (int i = 0; i < N; i++) {
            String tmp = sc.nextLine();
            if (dic.get(tmp) == null){
                dic.put(tmp, 1);
            } else {
                int x = dic.get(tmp)+1;
                dic.put(tmp, x);
            }
        }

        for (int i : dic.values()){
            if (max < i){
                max = i;
            }
        }

        for (String s : dic.keySet()){
            if(dic.get(s) == max) {
                System.out.println(s);
            }
        }
    }
}