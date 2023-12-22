import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<N; i++){
            list.add(sc.next());
        }
        List<String> listAns = new ArrayList<String>(new HashSet<>(list));
        System.out.println(listAns.size());
    }
}