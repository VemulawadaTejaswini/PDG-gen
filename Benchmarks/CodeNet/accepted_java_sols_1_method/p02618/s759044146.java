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
          System.out.println(i%26+1);
        }
    }
}
