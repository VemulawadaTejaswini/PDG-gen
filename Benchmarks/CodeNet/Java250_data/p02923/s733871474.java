import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
        int count = 0;
		int ans = 0;
        for(int i=0;i<a-1;i++){if(in[i]>=in[i+1]){count++;}
                               else{ans = Math.max(ans,count);
                                   count=0;
                                   }
                               if(i==a-2){ans = Math.max(ans,count);}
                              }       
		System.out.println(ans);
	}
}
