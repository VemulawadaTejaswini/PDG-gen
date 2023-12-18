import java.util.*;
public class Main {
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int d = sc.nextInt();  
      	int[] c = new int[26];
      	int[][] s = new int[d][26];
      	for(int i=0;i<26;i++){
          c[i] = sc.nextInt();
        }
      	for(int i=0;i<d;i++){
          for(int j=0;j<26;j++){
            s[i][j] = sc.nextInt();
          }
        }
      	for(int i=0;i<d;i++){
          int n = s[i][0];
          int pos = 0;
          for(int j=1;j<26;j++){
            if( s[i][j] > n ){
              n = s[i][j];
              pos = j;
            }
          }
          System.out.println(1);
        }
    }
}