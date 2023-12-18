import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int N = s.length();
		int K = sc.nextInt();
		int count = 0;
		int x = 0;
		if( N>=5 ){
			count = 5*N-10;
			x = 5;
		}else{
			count = N*(N+1)/2;
			x = N;
		}
		String[] sub = new String[count];
		s = s + "A";
		int a = 0;
		for( int i=x; i>0; i-- ){        
			for( int j=0; j<=N-i; j++ ){
				sub[a] = s.substring(j,j+i);
				a++;              
			}
		}     
		Arrays.sort(sub);
		int b = 0;  
		if( N>1 ){	//
		for( int i=0; i<a-1; i++ ){  
			if( !(sub[i].equals(sub[i+1])) ){
				b++;
			}      
			if( b==K ){
				System.out.println(sub[i]);             
				break;
			}
		}  
		}  		// 
		if( N>1 && b<K ){
			System.out.println(sub[a-1]);          
        }          
		if( N==1 ){
			System.out.println(sub[0]);
		} 
	}
}
