import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//??????a[]?????¨??????????¶??????????????????°??????
  
public class Main {

  static int n ;
  
  static int a[] = new int[405];

  static  Set<Integer> d=new HashSet<Integer>();
  static int sum[] = new int[32];
  
  static int sum_idx; 

  static int m;

  //????????¢??°?????§a[cnt]????¶????????????????tmp = ????????£?????????
  public static void dfs(int cnt, int tmp) {


    if (cnt == n) {
      sum[sum_idx] = tmp;
      d.add(sum[sum_idx]);
      sum_idx++;
     
      m++;
      return; 
    }

//    System.out.println("(not exit)cnt, tmp = " + String.valueOf(cnt) + ", " + String.valueOf(tmp));

    dfs(cnt+1, tmp);
    dfs(cnt+1, tmp + a[cnt]);
  }

  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	n=Integer.parseInt(sc.next());
	for(int i=0;i<n;i++){
		a[i]=Integer.parseInt(sc.next());
	}
	
    m = 0;
    sum_idx = 0;
    Arrays.fill(sum, 0);
    dfs(0, 0);
    
   
   
    
    int q=Integer.parseInt(sc.next());
    
    int x;
    for(int j=0;j<q;j++)
    {
    	x=Integer.parseInt(sc.next());
    
    	System.out.println((d.contains(x)) ? ("yes") : ("no"));
    }
    
  }
}