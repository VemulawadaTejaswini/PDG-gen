import java.util.*;
public class Main {
  	public static int[] count = new int[1000001];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a = new int[n];
      	for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
      
      	boolean aflag = true;
      	boolean bflag = false;
      	for(int i=0;i<n;i++){
          cc(a[i]);
        }
      	for(int i=2;i<6;i++){
          //System.out.print(i+":"+count[i]+"**");
          if( count[i] > 1 ){
            aflag = false;
          }
          if( count[i] == n ){
            bflag = true;
          }
        }
      	if( aflag ){
          System.out.println("pairwise coprime");
        }else if( !bflag ){
          System.out.println("setwise coprime");
        }else{
          System.out.println("not coprime");
        }
	}
  	public static boolean cc(int n){
      for(int i=2;i<n+1;i++){
        if( n % i == 0 ){
          count[i]++;
        }
        /*
        if( count[i] > 1 ){
          return false;
        }
        */
        if( i*i > n ){
          count[n]++;
          break;
        }
      }
      return true;
    }
}