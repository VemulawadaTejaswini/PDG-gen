	 					import java.math.BigInteger;
						import java.util.ArrayList;
						import java.util.Arrays;
					import java.util.Collection;
					import java.util.Collections;
					import java.util.Comparator;
					import java.util.HashMap;
						import java.util.Iterator;
					import java.util.LinkedList;
					import java.util.List;
					import java.util.Map;
				import java.util.Map.Entry;
				import java.util.PriorityQueue;
					import java.util.Scanner;
					import java.util.Set;
					import java.util.Stack;
					import java.io.BufferedReader; 
					import java.io.IOException; 
					import java.io.InputStreamReader; 
					import java.util.Scanner; 
					import java.util.StringTokenizer;
					import java.util.TreeMap;
					import java.util.TreeSet;
					
						public class Main {
						
							static FastReader sc= new FastReader();
							static List<Long> C;
							static List<Integer> B;
						static	int mod=(int)1e9+7;
							static boolean dp[][];
							public static void main(String[] args) {


								int n=sc.nextInt();
								//int c=0;
								int max=-1;
								C=new ArrayList<>();
								HashMap<Integer,Integer>map=new HashMap<>();
								boolean flag=false;
								for(int i=0;i<n;i++)C.add(sc.nextLong());

								BigInteger one =new BigInteger("0");
								BigInteger inc =new BigInteger("1");

								for(int i=0;i<n;i++) {

									for(int j=i+1;j<n;j++) {

										for(int k=j+1;k<n;k++) {
											
											if(C.get(i)!=C.get(k)&&C.get(j)!=C.get(i)&&C.get(k)!=C.get(j)&&C.get(i)+C.get(k)>C.get(j)&&C.get(j)+C.get(k)>C.get(i)&&C.get(i)+C.get(j)>C.get(k)) {one=one.add(inc);
											//System.out.println((i+1)+" "+(j+1)+" "+(k+1));
											}
									}
									}
									}
								System.out.println(one.toString());
								}
							
								
								
							
							static int exponentMod(int A,  
				                       int B, int C)  
				{  
				          
				    // Base cases  
				    if (A == 0)  
				        return 0;  
				    if (B == 0)  
				        return 1;  
				      
				    // If B is even  
				    long y;  
				    if (B % 2 == 0) 
				    {  
				        y = exponentMod(A, B / 2, C);  
				        y = (y * y) % C;  
				    }  
				      
				    // If B is odd  
				    else 
				    {  
				        y = A % C;  
				        y = (y * exponentMod(A, B - 1,  
				                             C) % C) % C;  
				    }  
				      
				    return (int)((y + C) % C);  
				}  
							
						static	int modulo(int a,int b,int c) {
							    long x=1;
							    long y=a;
							    while(b > 0){
							        if(b%2 == 1){
							            x=(x*y)%c;
							        }
							        y = (y*y)%c; // squaring the base
							        b /= 2;
							    }
							    return (int) x%c;
							}
							
							 static int power(int x, int y, int p) 
							    { 
							        // Initialize result 
							        int res = 1;      
							         
							        // Update x if it is more   
							        // than or equal to p 
							        x = x % p;  
							  
							       if (x == 0) return 0; // In case x is divisible by p;    
							  
							        while (y > 0) 
							        { 
							            // If y is odd, multiply x 
							            // with result 
							            if((y & 1)==1) 
							                res = (res * x) % p; 
							      
							            // y must be even now 
							            // y = y / 2 
							            y = y >> 1;  
							            x = (x * x) % p;  
							        } 
							        return res; 
							    }
							static int N = 100000;  
						      
						    static int n; // array size 
						      
						    // Max size of tree 
						    static int []tree = new int[2 * N]; 
									
							 static void build( int []arr)  
							    {  
							          
							        // insert leaf nodes in tree 
							        for (int i = 0; i < n; i++)  
							            tree[n + i] = arr[i]; 
							          
							        // build the tree by calculating 
							        // parents 
							        for (int i = n - 1; i > 0; --i)  
							            tree[i] = tree[i << 1] + 
							                      tree[i << 1 | 1];  
							    } 
							      
							    // function to update a tree node 
							    static void updateTreeNode(int p, int value)  
							    {  
							          
							        // set value at position p 
							        tree[p + n] = value; 
							        p = p + n; 
							          
							        // move upward and update parents 
							        for (int i = p; i > 1; i >>= 1) 
							            tree[i >> 1] = tree[i] + tree[i^1]; 
							    } 
							      
							    // function to get sum on 
							    // interval [l, r) 
							    static int query(int l, int r)  
							    {  
							        int res = 0; 
							          
							        // loop to find the sum in the range 
							        for (l += n, r += n; l < r; 
							                             l >>= 1, r >>= 1) 
							        { 
							            if ((l & 1) > 0)  
							                res += tree[l++]; 
							          
							            if ((r & 1) > 0)  
							                res += tree[--r]; 
							        } 
							          
							        return res; 
							    } 
							      
								
							
							
							static int a=1;
							
							static int  solve(ArrayList<Integer> A,int cost,int n,int k,HashMap<Integer,  Integer> map,int be) {
								//if(!map.containsKey(curr))map.put(curr,);
								//if(n==0&&curr!=0)return 1;
								if(n==0)return cost;
				//				if(dp[n]!=-1)return dp[n];
				
				
								if(map.get(A.get(n-1))>1) {
									map.put(A.get(n-1), map.get(A.get(n-1))-1);
									//int s=cost;
									 be++;
									if(map.get(A.get(n-1))==1)be++;
									
									System.out.println(be);
								//	System.out.println(A.get(n-1)+" "+ (k+cost-1));
									return Math.min(solve(A,k+cost-be,n-1,k,map,0),solve(A, cost, n-1, k, map,be));
									
								}
								else return solve(A, cost, n-1, k, map,be);
								
								
							}
							
							
							
						static class decimal{
							int n;double d;
							public decimal(int n,double d) {
								
								this.n=n;
								this.d=d;
								// TODO Auto-generated constructor stub
							}
						}
							
						static	boolean isPossible(List<Integer> C,int m,int k) {
								if(m==0)return false;
								for(int i=0;i<C.size();i++) {
									
									if(C.get(i)>m) {
										k-=C.get(i)/m;
									}
									if(k<0)return false;
								}
									return true;
								
								
							}
							  
							
							
							
							static boolean isSubsetSum(int set[],  int n, int sum) 
					{ 
					// The value of subset[i][j] will be 
					// true if there is a subset of 
					// set[0..j-1] with sum equal to i 
					boolean subset[][] = new boolean[sum + 1][n + 1]; 
					
					// If sum is 0, then answer is true 
					for (int i = 0; i <= n; i++) 
					subset[0][i] = true; 
					
					// If sum is not 0 and set is empty, 
					// then answer is false 
					for (int i = 1; i <= sum; i++) 
					subset[i][0] = false; 
					
					// Fill the subset table in botton 
					// up manner 
					for (int i = 1; i <= sum; i++) { 
					for (int j = 1; j <= n; j++) { 
					    subset[i][j] = subset[i][j - 1]; 
					    if (i >= set[j - 1]) 
					        subset[i][j] = subset[i][j] 
					                       || subset[i - set[j - 1]][j - 1]; 
					} 
					} 
					
					
					return subset[sum][n]; 
					} 
					
					
							
							
							static boolean search(ArrayList<Integer> a,int m,int h) {
								PriorityQueue<Integer> p=new PriorityQueue<Integer>(new Comparator<Integer>() {
										@Override
										public int compare(Integer o1, Integer o2) {
											// TODO Auto-generated method stub
											return o2-o1;
										}
								});
								
								
								
								for(int i=0;i<m;i++) {
									p.add(a.get(i));
								}
								int c=0;
								//System.out.println(p);
								while(!p.isEmpty()) {
									//System.out.println(p);
					
									h-=p.poll();
									if(h<0)break;
									
									c++;
									
								//	System.out.println(h+" "+p+" "+c+" "+m);
					
									if(!p.isEmpty()) {
									p.poll();
									c++;}
									
									
								}
							//	System.out.println(c!=m);
								if(c!=m)return false;
								
								return true;
							}
						//	static int  key=-1;
							
							
							
							
							
							
							static boolean isPowerOfTwo(long n) 
						    { 
						        if (n == 0) 
						            return false; 
						          
						        while (n != 1) 
						        { 
						            if (n % 2 != 0) 
						                return false; 
						            n = n / 2; 
						        } 
						        return true; 
						    } 
							
							 static boolean isPerfectSquare(double x)  
							    { 
							          
							        // Find floating point value of 
							        // square root of x. 
							        double sr = Math.sqrt(x); 
							      
							        // If square root is an integer 
							        return ((sr - Math.floor(sr)) == 0); 
							    } 
							
							
							
							
							
							
						static	int binarySearch(ArrayList<Long> arr, int l, int r, long x,int key) 
						    { 
						        if (r >= l) { 
						            int mid =  (r + l) / 2; 
						//  if(mid>=arr.size())return -1;
						            // If the element is present at the 
						            // middle itself 
						  			
						            if (arr.get(mid) == x) 
						                return mid+1; 
						  
						            // If element is smaller than mid, then 
						            // it can only be present in left subarray 
						            if (arr.get(mid) > x) {
						                return binarySearch(arr, l, mid - 1, x,key); 
						            }
						            // Else the element can only be present 
						            // in right subarray
						            key=mid+1;
						            return binarySearch(arr, mid + 1, r, x,key); 
						        } 
						  
						        // We reach here when element is not present 
						        // in array 
						        return key; 
						    } 
							
							
							
							
							
							
							
							
						    static boolean isPrime(long n) 
						    { 
						        // Corner cases 
						        if (n <= 1) 
						            return false; 
						        if (n <= 3) 
						            return true; 
						  
						        // This is checked so that we can skip 
						        // middle five numbers in below loop 
						        if (n % 2 == 0 || n % 3 == 0) 
						            return false; 
						  
						        for (int i = 5; i * i <= n; i = i + 6) 
						            if (n % i == 0 || n % (i + 2) == 0) 
						                return false; 
						  
						        return true; 
						    } 
						    
						    
						    
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
						            while (st == null || !st.hasMoreElements()) 
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
						    } 
							
							
								
						}
						
						class Sol {
							
							int value;int in;int i;
							Sol(int value,int in,int i){
								this.value=value;
								this.in=in;
								this.i=i;
							}
							
					}
				
				 class SegmentTree {
					
					SegNode st[];
					int n;
				//	long arr[];
					public SegmentTree(int n) {
							this.n=n;
						//this.arr=arr;
						st=new SegNode[4*n];
							
					}
					
					void init(long n) {
						
						for(int i=0;i<4*n;i++) {
							st[i]=new SegNode();
						}
						
					}
					
					void set(int i,long v,int x,int lx,int rx) {
						
						if(rx-lx==1) {
							st[x].sum=v;
							st[x].max=v;
							return ;
						}
						int m=lx+(rx-lx)/2;
						if(i<m) set(i,v,2*x+1,lx,m);
						else set(i,v,2*x+2,m,rx); 
						
						st[x].sum=st[2*x+1].sum+st[2*x+2].sum;
						long ma=Math.max(st[2*x+1].max,st[2*x+2].max);
							st[x].max=Math.max(ma,st[x].sum);
					}
					
					void set (int i,long v) {
						set(i,v,0,0,n);
					}
					
					long max=Integer.MIN_VALUE;
				long sum(int l,int r,int x,int lx,int rx) {
					if(lx>=r||l>=rx)return 0;
					if(lx>=l||rx<=r)return st[x].sum;
					
						int m=(rx+lx)/2;
						
						long s1=sum(l,r,2*x+1,lx,m);
						long s2=sum(l,r,2*x+2,m,rx); 	
						
						return max= Math.max(Math.max(Math.max(s1,s2),s1+s2),max);
						
					
					}
					long sum(int l,int r) {
						return sum(l,r,0,0,n);
					}
					
					
				
					
					
					
					
					
					
				
				}
					class SegNode{
						long max;long sum;
						public SegNode() {
							// TODO Auto-generated constructor stub
							sum=0;
							max=Integer.MIN_VALUE;
							
						}
					}
						
						
						
						
