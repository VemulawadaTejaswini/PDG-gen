import java.util.*;

public class Main{
	public static void main(String args[]){
     	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int q = sc.nextInt();
        int ar[] = new int[n+1];
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<n;i++){
         	set.add(s.nextInt());
           ar[i+1] = set.size();
        }
      for(int i =0;i<q;i++){
      	 int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b)
          System.out.println(1);
        else{
          System.out.println(ar[b]-ar[a-1]);
        }
           
        }
    }
}
