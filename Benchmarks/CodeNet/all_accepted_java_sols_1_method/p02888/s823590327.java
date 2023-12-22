import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l[] = new int [n];
    int total = 0;

    for(int i=0 ; i<n ; i++){
      l[i] = sc.nextInt();
    }

    Arrays.sort(l);

    for(int i=0 ; i<n-2 ; i++){
      for(int j=i+1 ; j<n-1 ; j++){
        int high = n;
        int low =  0;
        int middle = 0;
        while((high-low)>1){
          middle = (high+low)/2;
          if(l[middle]<l[i]+l[j]){
            low = middle;
          }else{
            high = middle;
          }
        }
        total = total + (high-j-1);
      }
    }
    System.out.println(total);
  }
}
