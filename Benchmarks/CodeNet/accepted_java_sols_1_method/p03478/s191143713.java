import java.util.*;

public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	//int x = 0;
        int c = 0;
 
	for(int i=n;i>=1;i--){
	    int sum = 0;
	    int m = i;
	    while(m>0){
		sum = sum + (m%10);
		m = m/10;	
	    }
	    if(sum>=a && sum<=b){
		c = c + i;
	    }
	}
	System.out.println(c);
    }
}
