import java.util.*;

 public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			String a = sc.next();
            int b = 0;
            int c;
            int d;
            int e;
            int f;
            int g;
            
            for( c = 0;N > c;c++ ){
                String t = sc.next();
                for( d = 0;t.length() > d;d++ ){
                    for( e = 1;; e++ ){
                        if( t.length() <= d + e*( a.length()-1 )){
                        break;
                        }
                        f = 1;
                        for( g = 0;g < a.length();g++ ){
                            if( a.charAt(g)!= t.charAt( d + e*g )){
                               f = 0;
                            break;
                            }
                        }
                        if( f==1 ){ b = b + 1;d = t.length();
                        break;
                        }
                        }
                    }
                } System.out.println(b);
                }
		}