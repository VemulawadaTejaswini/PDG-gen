import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int a[][] = new int[n][d];
    for(int i=0;i<n;i++){
      for(int j=0;j<d;j++){
        a[i][j]=sc.nextInt();
      }
    }
    int count=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        int total=0;
        for(int k=0;k<d;k++){
          total+=(a[i][k]-a[j][k])*(a[i][k]-a[j][k]);
        }
        int dist = (int)(Math.sqrt((double)total));
        if( dist*dist==total ){
          count++;
        }
      }
    }
    System.out.println(count);
  }
}