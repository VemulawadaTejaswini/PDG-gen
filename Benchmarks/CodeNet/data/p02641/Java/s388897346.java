import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        if(N == 0){
          System.out.println(X);
          System.exit(1);
        }
        List<Integer> hairetu = new ArrayList<>();;
        for(int i = 0; i < N; i++){
          hairetu.add(Integer.parseInt(sc.next())-X);
        }
        int i = 1;
        while(true){
          i *= -1;
          if(!hairetu.contains(i)){
            break;
          }
          i *= -1;
          if(!hairetu.contains(i)){
            break;
          }
          i++;
        }
        System.out.println(X+i);

        
    }
}
