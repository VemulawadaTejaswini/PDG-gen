
						
						import java.io.BufferedReader;
						import java.util.ArrayList;
						import java.util.Arrays;
						import java.util.Collections;
						import java.util.HashMap;
						import java.util.HashSet;
						import java.util.List;
						import java.util.Map;
						import java.io.IOException;
						import java.io.InputStreamReader;
					import java.math.BigInteger;
					import java.util.Scanner;
						import java.util.Set;
						import java.util.StringTokenizer;
					import java.util.Vector;
						
						
						
						
						public class Main {
							 static class FastReader 
							    { 
							        BufferedReader br; 
							        StringTokenizer st; 
							       
							  
							        public FastReader() 
							        { 
							            br = new BufferedReader(new
							                     InputStreamReader(System.in)); 
							        } 
							       
							        String next() 
							        { 
							            while (st == null || !st.hasMoreTokens()) 
							            { 
							                try
							                { 
							                    st = new StringTokenizer(br.readLine()); 
							                } 
							                catch (IOException  e) 
							                { 
							                    e.printStackTrace(); 
							                } 
							            } 
							            return st.nextToken();
							            
							        } 
							  
							        int nextInt() 
							        { 
							            return Integer.parseInt(next()); 
							        } 
							  
							        long nextLong() 
							        { 
							            return Long.parseLong(next()); 
							        } 
							  
							        double nextDouble() 
							        { 
							            return Double.parseDouble(next()); 
							        } 
							  
							        String nextLine() 
							        { 
							            String str = ""; 
							            try
							            { 
							                str = br.readLine(); 
							            } 
							            catch (IOException e) 
							            { 
							                e.printStackTrace(); 
							            } 
							            return str; 
							        }
						
									public Character charAt(int i) {
										// TODO Auto-generated method stub
										return null;
									} 
									public BigInteger nextBigInteger() {
										// TODO Auto-generated method stub
										return null;
									} 
							    }
						
							 static int gcd(int a , int b) {
								 if(b==0)return a;
								 return gcd(b,a%b);
							 }
						
							/**
							 * @param args
							 * @throws IOException
							 */
							 static int m =(int) (1e9+7);
							 static long mod(long x) {
								 
								 return ((x%m+m)%m);
							 }
							 static long add(long x,long y) {
								 return mod((mod(x)+mod(y)));
							 }
							 static long mul(long x,long y) {
								 return mod((mod(x)*mod(y)));
							 }
							 
							 static List<Integer> a= new ArrayList<>();
							 static int solve(List<Integer> l) {
								 int m = Integer.MAX_VALUE;
								 while(!a.contains(m) && !l.contains(m)) {
									  m++;
								 }
								 a.add(m);
								 return m;
							 }
							 static  int[] readAr(int n) {
						        	FastReader s=new FastReader();
						        	int [] ar = new int [n];
						        	for(int i=0;i<n;i++) {
						        		ar[i]=s.nextInt();
						        	}
						        	return ar;
						        }
						       static int[] printAr(int[] ar,int n) {
						        	for(int i=0;i<n;i++) {
						        		System.out.print(ar[i]+" ");
						        	}
						           	return ar;
						        }
							public static void main(String[] args)throws IOException  {
								FastReader s=new FastReader();
								int a = s.nextInt();
								int b = s.nextInt();
								int c = s.nextInt();
								int d = s.nextInt();
								long max = Math.max((long)a*c, (long)a*d);
								long m2 =  Math.max((long)b*c, (long)b*d);
								
								System.out.println((long)Math.max(max, m2));
								
							}
}
						
					
						
