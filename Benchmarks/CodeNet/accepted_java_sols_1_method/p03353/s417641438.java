import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int K = sc.nextInt();
        Set<String> set = new HashSet<String>();
        for(int i=0;i<K;i++){
          for(int j=0;j<S.length()-i;j++){
            set.add(S.substring(j,j+i+1));
          }
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(list.get(K-1));
    }
}