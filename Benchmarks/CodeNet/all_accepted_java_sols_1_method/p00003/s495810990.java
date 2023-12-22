import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	public static void main (String[] args){
		Scanner sn = new Scanner( System.in );
		int x = sn.nextInt();
		int[] a = new int[3];
		while(sn.hasNext()){
            for(int i=0;i<3;i++)
                a[i] = sn.nextInt();                
            Arrays.sort(a);
            if(a[2]*a[2] == a[0]*a[0] + a[1]*a[1])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
		
		
	}
	
} 