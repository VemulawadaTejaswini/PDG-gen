import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		
      	int count4 = 0;
      	int count2 = 0;
      	int count1 = 0;
      	
      	for(int i=0; i<n; i++){
            if(a[i]%4==0) count4++;
            else if(a[i]%2==0) count2++;
            else count1++;
        }
      	
      	if(count1>count4+1 ){
      	    System.out.println("No");
      	    return;
      	    
      	}else if(count1==count4+1 && count2>0){
      	    System.out.println("No");
      	    return;
      	    
      	}
      	System.out.println("Yes");
      	
	}
}
