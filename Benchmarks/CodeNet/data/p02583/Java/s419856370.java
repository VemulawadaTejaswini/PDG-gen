import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int L[]=new int[N];
        for(int i=0; i<N; i++){
            L[i]=sc.nextInt();
        }
        int res = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    if(L[i]==L[j] || L[j]==L[k] || L[k]==L[i]){
                        continue;
                    }else{
                        int max = Math.max(L[k],Math.max(L[i],L[j]));
                        if(max<L[i]+L[j]+L[k]-max){
                            res++;
                        }

                    }

                }
            }
        }
		System.out.println(res);
	}
}