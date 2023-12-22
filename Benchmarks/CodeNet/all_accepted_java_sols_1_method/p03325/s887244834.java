import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int n = sc.nextInt();
    List<Long> a = new ArrayList<Long>();
    int fe = -1; //最後の偶数の位置
    int count=0;
    for(int i=0;i<n;i++) {
    	a.add(sc.nextLong());
    	if(a.get(i)%2 == 0) {
    		fe = i;
    	}
    }
    sc.close();
    long j = 0;
    for(int i=fe;i>=0;i--) {
    	j = a.get(i);
    	while(j%2==0) {
    		count++;
    		j /= 2;
    		//System.out.print(j+", ");
    	}
    	//System.out.println("");
    }
    System.out.println(count);
    
  }
  
}