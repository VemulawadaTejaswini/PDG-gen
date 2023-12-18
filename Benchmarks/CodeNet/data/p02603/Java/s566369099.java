import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];        
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }       
		long ans = 1000;
        long kabu = 0;
        int i = 0;
        while(i<a){long max = in[i];if(i==a-1){i=a;}
                   for(int j=i+1;j<a;j++){         
          if(in[j]<max){          
          kabu = ans/in[i];
        ans+=(max-in[i])*kabu;
            i=j;
            break;}
          else{max = in[j];
              if(j==a-1){kabu = ans/in[i];
                         ans+=(max-in[i])*kabu;
                         i=j;
                        }
              }                                                                                                       
        }                                                                                     
                  }        
		System.out.println(ans);
	}
}