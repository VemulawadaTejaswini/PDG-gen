import java.util.*;
public class Main {
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    int[] a = new int[n];
    HashMap map = new HashMap();
    boolean flg = true;
    for (int i=0;i<n;i++){
	    a[i]=sc.nextInt();
        if (map.containsKey(a[i])) {
            flg=false;
            break;
        } else {
            map.put(a[i],a[i]);
        }
     }

     if (flg) {
         System.out.println("YES");
     } else {
        System.out.println("NO");
     }
  }
}





