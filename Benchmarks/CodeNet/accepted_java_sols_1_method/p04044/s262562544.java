import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    List<String> a = new ArrayList<>();
    // String a[] = new String[N];
    for(int i=0; i<N ;i++){
        a.add(sc.next());
        // a[i] = sc.next();
    }
    Collections.sort(a);
    String sum = "";
    for(String s : a){
        sum = sum.concat(s);
    }
        System.out.println(sum); 

    }    
}