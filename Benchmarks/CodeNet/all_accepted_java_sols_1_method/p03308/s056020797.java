import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       	int ary[] = new int[num];
      
      	for(int i = 0; i < num; i++)
        {
        	ary[i] = sc.nextInt();
        
        }
      	
      	Arrays.sort(ary);
     	int ans = ary[num-1] - ary[0];
      	System.out.println(ans);
      
    }
}