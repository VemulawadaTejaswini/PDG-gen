import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int N = sc.nextInt();
    Integer[] p = new Integer[N];
    for(int i=0;i<N;i++){
      p[i] = sc.nextInt();
    }
    int i=0;
    int abs = 0;
    while(true){
      if(!(Arrays.asList(p).contains(X-i))){
        abs = -i;
        break;
      }else if(!(Arrays.asList(p).contains(X+i))){
        abs = i;
        break;
      }
      i++;
    }
    System.out.println(X+abs);
  }
}