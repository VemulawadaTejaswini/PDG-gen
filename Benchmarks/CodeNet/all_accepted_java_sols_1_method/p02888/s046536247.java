import java.util.*;
public class Main{
	public static void main(String[] args){
      	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int[] L = new int[N];
        for(int i=0;i<N;i++){
          L[i] = sc.nextInt();
        }
        int[] check = new int[1001];
        for (int i=0;i<1001;i++){check[i]=0;}
      	long ans = 0;
        for(int i=0;i<N;i++){
          check[L[i]]++; 
        }
      	for(int i=0;i<N-1;i++){
          for(int j=i+1;j<N;j++){
            int sa = ((L[i]>L[j])?L[i]-L[j]:L[j]-L[i])+1;
            int wa = ((L[i]+L[j]>1000)?1000:L[i]+L[j]-1);
            for(int l = sa;l<=wa;l++){
              ans += check[l];
       
            }
            //自分を数えない
            if(sa <= L[i]&&L[i] <= wa){ans--;}
            if(sa <= L[j]&&L[j] <= wa){ans--;}
          }
        }
        System.out.println(ans/3);
    }
}