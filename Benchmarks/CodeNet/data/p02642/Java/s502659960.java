import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Long[] hairetu = new Long[N];
        for(int i = 0; i < N; i++){
          hairetu[i] = Long.parseLong(sc.next());
        }
        Arrays.sort(hairetu);
        int count = N;
        for(int i = 0; i < N; i++){
          for(int j = 0; j < N; j++){
            if(i!=j && hairetu[i]%hairetu[j] == 0){
              //System.out.println(hairetu[i] + " " + hairetu[j]);
              count--;
              break;
            }
          }
        }
        System.out.println(count);
    }
}
