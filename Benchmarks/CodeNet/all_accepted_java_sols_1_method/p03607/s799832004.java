import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力                                                                                                  
        int N = sc.nextInt();
	int a[] = new int[N];
	int i,j;
	int res=0;
        for(i=0;i<N;i++){
	    a[i] = sc.nextInt();
	}
	Arrays.sort(a);
        j=1;
        for(i=0;i<N-1;i++){
	    if(a[i]==a[i+1]) j++;
	    else{
                if(j%2 == 1) res++;
                j=1;
            }
        }
	if(j%2==1) res++;
        // 出力                                                                                                        
        System.out.println(res);
    }
}


