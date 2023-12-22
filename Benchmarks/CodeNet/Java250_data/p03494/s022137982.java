import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int minDivTwo = 1000;
    	for(int i=0; i<n; i++){
          	int v = sc.nextInt();
			int c = 0;
          	while(v > 0 && v%2 == 0)	{
            	v/=2;
	            c++;
	        }
            minDivTwo = Math.min(c, minDivTwo);
        }
        System.out.println(minDivTwo);
    }
}
