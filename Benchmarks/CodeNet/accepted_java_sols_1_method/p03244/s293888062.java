import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    int v[] = new int[n];
    for(int i=0; i<n; i++) v[i] = sc.nextInt();
    Integer odd[] = new Integer[100010];
    Arrays.fill(odd,0);
    Integer even[] = new Integer[100010];
    Arrays.fill(even,0);
    int j=0;
    Integer total[] = new Integer[100010];
    Arrays.fill(total,0);
    for(int i=0; i<n; i++){
      total[v[i]]++;
    }
    for(int i=0; i<n/2; i++){
      odd[v[j]]++;
      even[v[j+1]]++;
      j+=2;
    }
    Arrays.sort(odd, Comparator.reverseOrder());
    Arrays.sort(even, Comparator.reverseOrder());
    Arrays.sort(total, Comparator.reverseOrder());
    int ans;
    if(odd[0] + even[0] == total[0]){
      ans = Math.min(n - odd[0] - even[1], n - odd[1] - even[0]);
    }else{
      ans = n - odd[0] - even[0];
    }
    System.out.println(ans);
  }
}