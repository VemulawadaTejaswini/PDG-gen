import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long ans = 1;
                
                int N = scan.nextInt();
                int K = scan.nextInt();
                int[] A = new int[N];
                int minusnum = 0;
                for(int i=0; i<N;i++){
                    A[i]=scan.nextInt();
                    if(A[i]<0){
                        minusnum++;
                    }
                }              
                
                if(minusnum==N && K%2==1){
                    Arrays.sort(A);
                    for(int i=N-1; i>=N-K; i--){
                        long t = (long) A[i];
                        ans = ans*t;
                    }
                }else{
                    Arrays.sort(A);
                    int hu =0;
                    int kaisu = 0;
                    int max = N-1;
                    int min = 0;
                    while(kaisu<K){
                        
                        if(A[max]<(-A[min])){
                            long t = (long) A[min];
                            ans = ans*(-t);
                            min++;
                            hu++;
                        }else if(A[max]>(-A[min])){
                            long t = (long) A[max];
                            ans = ans*t;
                            max--;
                        }else{
                            if(hu%2==0){
                                long t = (long) A[max];
                                ans = ans*t;
                                max--;
                            }else{
                                long t = (long) A[min];
                                ans = ans*(-t);
                                min++;
                                hu++;
                            }
                        }
                        
                        kaisu++;
                    }
                    if(hu%2==1){
                        int humax = 0;
                        for(int i=0; i<=min; i++){
                            if(A[i]<0 && A[i+1]>=0){
                                humax=i;
                                break;
                            }
                        }
                        int maxhu =  Math.min(humax, min);
                        long a = (long) Math.abs(A[maxhu]);
                        long b = (long) A[max];
                        ans = ans / a * b;
                    }                   
                }
                long anslong = ans%(10*10*10*10*10*10*10*10*10+7);
                if(anslong<0){
                    anslong = 1000000007+anslong;
                }
  
                System.out.println(anslong);
        }               
}