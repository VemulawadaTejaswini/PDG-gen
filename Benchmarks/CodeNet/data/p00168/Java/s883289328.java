import java.lang.*;
import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
	int[] m = new int[31];

	m[1]=1;
	m[2]=2;
	m[3]=4;
	
	for(int i=4; i<=30;i++){
	    m[i] = m[i-1]+m[i-2]+m[i-3];
	    
	}
	
	while(true){
	int N = sc.nextInt();
	if(N==0)break;
	    System.out.println( m[N]/3650 + 1 );
	}	
    }
}