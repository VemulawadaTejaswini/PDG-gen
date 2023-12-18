import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] l = new int[n];
    for(int i = 0;i<n;i++){
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    int count = 0;
    for(int i = n-1;i>=2;i--){
      for(int j = 0;j<=i-2;j++){
        for(int k = j+1;k<i;k++){
          if(l[i]==l[j]||l[i]==l[k]||l[j]==l[k])continue;
          if(l[k]+l[j]>l[i])count++;
        }
      }
    }
    System.out.println(count);
  }
}
