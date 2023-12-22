import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[][] a = new int[100001][2];
      int[][] b = new int[100001][2];
      for(int i = 0;i < n/2;i++){
      	int x = sc.nextInt();
        int y = sc.nextInt();
        a[x][0]=x;
        b[y][0]=y;
        a[x][1]++;
        b[y][1]++;
      }
      Arrays.sort(a,Comparator.comparing((int[] x)->x[1]).reversed());
      Arrays.sort(b,Comparator.comparing((int[] x)->x[1]).reversed());
      if(a[0][0]!=b[0][0])System.out.println(n-a[0][1]-b[0][1]);
      else System.out.println(Math.min(n-a[1][1]-b[0][1],n-a[0][1]-b[1][1]));
    }
}