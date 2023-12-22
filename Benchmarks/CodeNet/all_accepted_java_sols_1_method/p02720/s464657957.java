import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		long [] in = new long [100000];
        long base = 1;
        for(int i=0;i<9;i++){in[i] = base;
                             base++;
                            }
		int point = 0;
        int search = 9;        
        while(search<100000){if(search<100000 && in[point]%10!=0){
          in[search]=10*in[point]+in[point]%10-1;
          search++;
         }
                             if(search<100000){in[search]=10*in[point]+in[point]%10;
                                              search++;}
                             if(search<100000 && in[point]%10!=9){
          in[search]=10*in[point]+in[point]%10+1;
          search++;}
                        point++;}        
		System.out.println(in[k-1]);
	}
}