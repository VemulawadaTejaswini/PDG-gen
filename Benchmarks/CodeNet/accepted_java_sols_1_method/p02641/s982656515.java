import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int X = sc.nextInt();
      	int Y = sc.nextInt();
      	int[] num = new int[Y];
      	int dist = 10000;
      	int ans = X;
      	for(int i=0;i<Y;i++){
          num[i] = sc.nextInt();
        }
      	Arrays.sort(num);
      	int pos = 0;
      	for(int i=-101;i<102;i++){
          if( pos < Y && num[pos] == i ){
            pos++;
            continue;
          }
          if( Math.abs( i-X ) < dist ){
            dist = Math.abs( i-X );
            ans = i;
          }
        }
      System.out.println(ans);    	
	}
}