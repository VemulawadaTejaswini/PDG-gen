import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	long N = (long)Math.pow(10,18);
      	long[] num = new long[n];
      	long ans = 1;
      	boolean overF = false;
      	boolean zeroF = false;
		for(int i=0;i<n;i++){
			num[i] = sc.nextLong();
          	if( num[i] == 0 ){
              zeroF = true;
              break;
            }
        }
      if( !zeroF ){
     	for(int i=0;i<n;i++){
          int a1 = String.valueOf( ans ).length();
          int n1 = String.valueOf( num[i] ).length();
          	if( ans * num[i] > N || (a1>9&&n1>9) ){
              overF = true;
              break;
            }
          ans *= num[i];
        }
      }
      if( zeroF ){
        ans = 0;
      }else if( overF ){
        ans = -1;
      }else{
      
      }         
       System.out.println(num[0]*num[1]); 
	}
}