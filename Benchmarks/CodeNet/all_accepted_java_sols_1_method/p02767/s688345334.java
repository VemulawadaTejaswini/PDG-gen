import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
        int b = 1000000;
		int c = 0;
        for(int i=1;i<=100;i++){
          for(int j=0;j<a;j++){c+=(in[j]-i)*(in[j]-i);
                               if(j==a-1){b=Math.min(b,c);
                                          c=0;                                                
                                         }                              
                              }                            
        }       
		System.out.println(b);
	}
}
