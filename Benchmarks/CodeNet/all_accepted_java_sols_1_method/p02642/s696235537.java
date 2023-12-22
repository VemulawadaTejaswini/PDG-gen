import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    boolean[] arr = new boolean[1000001];
    boolean[] is = new boolean[1000001];
    int n = Integer.parseInt(sc.next());
    int[] a = new int[n];
    for(int i=0;i<n;i++){
      a[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(a);
    int sum = 0;
    for(int i=0;i<n;i++){
      if(!arr[a[i]] && !is[a[i]]){
       
        //System.out.println(a[i]);
        sum++;
        for(int j=2*a[i];j<1000001;j+=a[i]){
          arr[j] = true;
        }
        is[a[i]] = true;
      }else if(!arr[a[i]] && is[a[i]]){
        arr[a[i]] = true;
        sum--;
      }
    }
    System.out.println(sum);
                    
  }
}