import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        long min = k*(k+1)/2-n;
        if(min>=0){for(int i=0;i<n;i++){System.out.println(n);}
                  }        
        else{int [] in = new int [n];      
        for(int i=0;i<n;i++){
                             in[i] = sc.nextInt();
                            }
        int [] in2 = new int [n];
        int min2 = 0;
        for(int i=0;i<k;i++){min2+=i+1;
                             for(int j=0;j<n;j++){in[j]+=min2;}
                            }       
		for(int i=0;i<n;i++){System.out.println(in[i]);
                            }
       }
	}
}