import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
		String s = sc.next();
        long r = 0;
        long g = 0;
        long b = 0;
        for(int i=0;i<a;i++){if(s.charAt(i)=='R'){r++;}
                             if(s.charAt(i)=='G'){g++;}
                             if(s.charAt(i)=='B'){b++;}
                            }
        long ans = r*g*b;
        if(a>1){for(int i=0;i<a-1;i++){char c = s.charAt(i);
               for(int j=i+1;j<a;j++){char d = s.charAt(j);
               if(2*j-i<a && s.charAt(2*j-i)!= c && s.charAt(2*j-i)!= d && c!=d){ans--;}                                                                                                                          
                                     }                                       
                                      }                                                                     
               }                                  
		System.out.println(ans);
	}
}
