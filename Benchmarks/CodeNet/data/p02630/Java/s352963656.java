import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] a  = new int[n];
      	int max = 0;
      	for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
      	int q = sc.nextInt();
      	int[] b = new int[q];
      	int[] c = new int[q];
      	for(int i=0;i<q;i++){
          b[i] = sc.nextInt();
          c[i] = sc.nextInt();
        }
      	int[] tmp = new int[100001];
      	for(int i=0;i<a.length;i++){
          tmp[a[i]] += 1;
        }
      	long sum = 0;
      	for(int i=0;i<tmp.length;i++){
          sum += tmp[i]*i;
        }
      	
      	for(int i=0;i<b.length;i++){    
          sum -= tmp[b[i]]*b[i];
          sum -= tmp[c[i]]*c[i];
          tmp[c[i]] += tmp[b[i]];
          tmp[b[i]] = 0;
          sum += tmp[c[i]]*c[i];
          System.out.println(sum);
        }
	}
}
  /*
        if( (int)s.charAt(0)-48 >= 0 && (int)s.charAt(0)-48 <=48 ){
*/