import java.util.*;
import java.io.*;
public class Main {
	static int[] array;
	public static void main(String[] args) throws Exception{
		int num = 1000000007;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int k = Integer.parseInt(st.nextToken());
 		ArrayList<Long> positives = new ArrayList<Long>();
 		ArrayList<Long> negatives = new ArrayList<Long>();
 		StringTokenizer st1 = new StringTokenizer(bf.readLine());
 		long prod =1;
 		for(int i = 0;i<n;i++){
 			long number = Long.parseLong(st1.nextToken());
 			if (number < 0)
 				negatives.add(number);
 			else{
 				positives.add(number);
 			}
 		}
 		Collections.sort(positives);
 		Collections.sort(negatives);
 		if (k == n){
 			prod =1;
 			for(long j : positives){
 				prod*= j;
 				prod = (prod%num+num)%num;
 			}
 			for(long j : negatives){
 				prod*= j;
 				prod = (prod%num+num)%num;
 			}
 			out.println(prod);
 		}
 		else if (positives.size() == 0){
 			if (k%2 == 0){
 				prod = 1;
 				for(int i = 0;i<k;i++){
 					prod*=negatives.get(i);
 					prod = (prod%num+num)%num;
 				}
 				out.println(prod);
 			}
 			else if (k%2 == 1){
 				prod = 1;
 				for(int i = negatives.size()-1;i>=negatives.size()-k;i--){
 					prod*=negatives.get(i);
 					prod = (prod%num+num)%num;
 				}
 				out.println(prod);
 			}
 		}
 		else{
 			prod = 1;
 			int indexpositive = 0;
 			int indexnegative = 0;
 			if (k%2 == 0){
 				if (positives.size()%2 ==0){
 					prod = 1;
 					if (k < positives.size()){
 						for(int i = positives.size()-1;i>=positives.size()-k;i--){
 							prod*=positives.get(i);
 							prod = (prod%num+num)%num;
 						}
 						indexpositive = positives.size();
 						indexnegative = -1;
 						
 					}
 					else{
 						for(int i = positives.size()-1;i>=0;i--){
 							prod*=positives.get(i);
 							prod = (prod%num+num)%num;
 						} 	
 						for(int i=0;i<k-positives.size();i++){
 							prod*=negatives.get(i);
 							prod = (prod%num+num)%num;
 						}
 						
 						indexpositive = positives.size();
 						indexnegative = -1+(k-positives.size());
 					}
 				}
 				else if (positives.size()%2 == 1){
 					prod =1 ;
 					if (k < positives.size()){
 						for(int i =positives.size()-1;i>=positives.size()-k;i--){
 							prod = prod*positives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						
 						indexpositive = positives.size();
 						indexnegative = -1;
 					}
 					else{
 						for(int i =1;i<positives.size();i++){
 							prod = prod*positives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						for(int i =0;i<k-(positives.size()-1);i++){
 							prod = prod*negatives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						
 						
 						indexpositive = positives.size();
 						indexnegative = -1+(k-(positives.size()-1));
 					}
 				}
 			}
 			else{
 				if (positives.size()%2 == 0){
 					if (k < positives.size()){
 						for(int i =positives.size()-1;i>=positives.size()-k;i--){
 							prod = prod*positives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						
 						indexpositive = positives.size();
 						indexnegative = -1;
 					}
 					else{
 						for(int i =1;i<positives.size();i++){
 							prod = prod*positives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						for(int i =0;i<(k-(positives.size()-1));i++){
 							prod = prod*negatives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						
 						indexpositive = positives.size();
 						indexnegative = -1 + (k-(positives.size()-1));
 						
 					}
 				}
 				else if (positives.size()%2 == 1){
 					if (k < positives.size()){
 						for(int i =positives.size()-1;i>=positives.size()-k;i--){
 							prod = prod*positives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						indexpositive = positives.size();
 						indexnegative = -1;
 					}
 					else{
 						for(int i =0;i<positives.size();i++){
 							prod = prod*positives.get(i);
 	 						prod = (prod%num+num)%num;
 						}
 						for(int i = 0;i<k-positives.size();i++){
 							prod = prod*negatives.get(i);
 							prod = (prod%num+num)%num;
 						}
 						indexpositive = positives.size();
 						indexnegative = -1+(k-positives.size());
 					}
 				}
 			}
 			
 			

 			while(indexpositive > k%2+1 && indexnegative < negatives.size()-2){
 				long prod1 = positives.get(indexpositive-1)*positives.get(indexpositive-2);
 				long prod2 = negatives.get(indexnegative+1)*negatives.get(indexnegative+2);
 				if (prod2 > prod1){
 					prod*=prod2;
 					prod = (prod%num+num)%num;
 					prod*=power(prod1, num-2, num);
 					prod = (prod%num+num)%num;
 				}
 				else{
 					break;
 				}
 				indexpositive-=2;
 				indexnegative+=2;
 			}
 			out.println(prod);
 		}
 		out.close();
 		
 		
 		
 		
 	}
	public static int power(long x, long y, long mod){
		long ans = 1;
		while(y>0){
			if (y%2==1)
				ans = (ans*x)%mod;
			x = (x*x)%mod;
			y/=2;
		}
		return (int)(ans);
	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


