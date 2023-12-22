import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    ArrayList<Integer> a = new ArrayList<Integer>(n);
    ArrayList<Integer> b = new ArrayList<Integer>(n-1);

    for (int i=0 ; i<n ; i++){
      a.add(0);
    }
    for (int i=0 ; i<n-1 ; i++){
      b.add(sc.nextInt());
    }

    int p = 0;
    //処理
    for (int i=0 ; i<n-1 ; i++){
        if(i == 0){
            a.set(i, b.get(i));
        }else{
            if(b.get(i) < b.get(i-1)){
                a.set(i, b.get(i));
            }
        }
        a.set(i+1, b.get(i));
        p += (int)a.get(i);
    }
    System.out.println(p+(int)a.get(n-1));
  }
}