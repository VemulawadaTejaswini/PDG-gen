import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k =sc.nextInt();
        ArrayList<Integer> array=new ArrayList<Integer>();
        int cnt=0;
        for(int i =0;i<k;i++) {
        		int d =sc.nextInt();
        		for(int j=0 ;j<d ;j++) {
                  int work = sc.nextInt();
                 array.add(work);
        		}
        }
        for(int i = 1 ;i<n+1;i++) { 
          if(array.contains(i) ==false) {
           cnt+=1; 
          }
        }
System.out.println(cnt);
	}
}