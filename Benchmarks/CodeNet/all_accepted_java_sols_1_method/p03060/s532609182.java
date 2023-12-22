import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int array1[] = new int[n];
        int array2[] = new int[n];
      	int ans = 0;
      	for(int i=0; i<n; i++){
          array1[i] = sc.nextInt();
        }
      	for(int l=0; l<n; l++){
          array2[l] = sc.nextInt();
        }
      	for(int m=0; m<n; m++){
          if(array1[m]>array2[m]){
            ans += array1[m]-array2[m];
          }
        }
      	System.out.println(ans);
    }
}
            