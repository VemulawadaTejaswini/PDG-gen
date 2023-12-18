import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Set<String> set = new HashSet<String>() {
          {
            for (int i=0;i<N;i++){
            add(sc.next());
            }
        }
        };
      if (N==set.size()){
        System.out.println("YES");
      }else{
        System.out.println("NO");
      }
      

    }
}