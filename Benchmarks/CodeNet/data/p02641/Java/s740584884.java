import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int n = sc.nextInt();
      	int[] p = new int[n];
      	int min = 200;
      	int pos = 0;
      	boolean ans = false;
		for(int i=0;i<n;i++){
          p[i] = sc.nextInt();
        }
      	for(int i=0;i<101+1;i++){
          ans = true;
          for(int j=0;j<n;j++){
            if( p[j] == i ){
              ans = false;
            }
          }
          if( ans ){
            if( Math.abs(x - i) < min ){
              min = Math.abs(x - i);
              pos = i;
            }
          }
        }
      System.out.println(pos);
	}
}