import java.util.*; 
import java.math.*;

public class Main {
 
	static final int maxn =  100000 ; 
	static int   []np  = new int  [ maxn ] ;  
	static int   [] pl = new int  [maxn]  ; 
	static int  top ; 
	static  long data[] = new  long [maxn];  
	static int  sz ; 

	
	static long gcd( long a,  long b ){  
		
		return b == 0 ? a :  gcd(  b ,  a % b) ;  
	}
	static void init (){  
		top = 0 ;  
		for( int i=2 ; i < maxn   ; ++i){  
			if( np[ i] ==0){  
				pl[ top ++] = i ;
			}    
			for( int j= i + i ;  j < maxn ; j += i){  
				np[ j ] = 1 ; 	
			}
			
		}
		
		
	}  
  	public static void main( String [] argvs)throws Exception {
 		
  		init (); 
  		
  		Scanner in = new Scanner ( System.in) ;  
  		int n ;        
  		
  		while( in.hasNext()){    
  			 n = in.nextInt() ;     
  			 if(  n ==0) break;
  			 long  t =  0 ;   
  			 BigInteger x = BigInteger.ZERO ;  
  			 BigInteger y = BigInteger.ZERO ;    
  			 BigInteger pp =BigInteger.ZERO; 
  			
  			 for ( int i= 1;  i <= n*(n+1)/2 ; ++i){ 
  				 data[ i]= in.nextLong() ;    
  				 if( data[i]%2==1)  {  
  					 x = x.add( BigInteger.valueOf( data[i]));  
  					 continue ; 
  				 }
  				 y = y.add( BigInteger.valueOf(data[i])) ;
  				 if( t ==0 )  t = data[ i ];  
  				 else t = gcd ( t , data[ i] );   
  				 pp = pp.add( BigInteger.valueOf(data[i]).pow(2)) ;
  			 }
  			 x = x.multiply(BigInteger.valueOf(2)) ;
  			 BigInteger z = y.multiply(y);  
  			 int f = 0 ;  

  			 for (long i = 1 ;   i * i <=  t&& i * i <=3000000000L  ;  i ++ ){    
  				 
  				 if(  i%2 ==1 &&   t /i % 2 == 0 ){   
  					 	 if( t /i > 3000000000L){  
  					 		 
  					 	 }else{
  					     BigInteger dd =  BigInteger.valueOf(t/i).pow(2) ;
  					     
  						 BigInteger lz =    pp.divide(dd) ; 
  						 lz  = lz.add( x)  ;
  						 lz = lz.multiply(dd);  
  						 if( lz.compareTo(z)==0){  
  							 long a0 = t / i ; 
  							 int tot = 0 ;  
  							 System.out.println(a0) ;
  							 for( int j= 1 ;  j <= n * ( n+ 1)/2 ; ++j){  
  								 
  								 if( data[j]%2==0){    
  									 ++tot ;
  									 System.out.print(data[j]/a0 ) ;  
  									 if( tot == n){  
  										System.out.println("");
  									 }else{ 
  										System.out.print(" ");
  									 }
  									 
  								 }  
  					
  							 }
  							 f = 1; 
								 break;
  						 }
  					 	 }
  				 }
  			     if( f>0 ) break ;  
  				 if(  i%2 ==0 &&   t /i % 2 !=0 ){ 
					     BigInteger dd =  BigInteger.valueOf(i).pow(2) ;
					     
						 BigInteger lz =    pp.divide(dd) ; 
						 lz  = lz.add( x)  ;
						 lz = lz.multiply(dd);  
						 if( lz.compareTo(z)==0){  
							 long a0 =  i ; 
							 int tot = 0 ;  
							 System.out.println(a0) ;
							 for( int j= 1 ;  j <= n * ( n+ 1)/2 ; ++j){  
								 
								 if( data[j]%2==0){    
									 ++tot ;
									 System.out.print(data[j]/a0 ) ;  
									 if( tot == n){  
										System.out.println("");
									 }else{ 
										System.out.print(" ");
									 }
									 
								 }  
						
							 }
							 f = 1; 
							 break;
						 }
				 }  
  				 if( f > 0 ) break ;
  			 }
  				
  				 
  				 
  		
  				
  			
  		}


 		
	}
}