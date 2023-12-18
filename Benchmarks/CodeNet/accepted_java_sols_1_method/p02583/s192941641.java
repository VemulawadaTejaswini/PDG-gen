import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),L[]=new int[N],res=0;
      	for(int i=0;i<N;i++){
          	L[i]=sc.nextInt();
        }
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    if(L[i]+L[j]>L[k]&&L[i]+L[k]>L[j]&&L[k]+L[j]>L[i]&&L[i]!=L[j]&&L[j]!=L[k]&&L[k]!=L[i]){
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
        /*long X=sc.nextLong(),K=sc.nextLong(),D=sc.nextLong(),end=0,endl=0;
        if(K>X/D){
            if(Math.abs((X/D)*D)<Math.abs(((X/D)+1)*D)){
                end=Math.abs(X-(X/D)*D);
                endl=Math.abs(X-((X/D)+1)*D);
                if((K-X/D)%2==0){
                    System.out.println(end);
                }else{
                    System.out.println(endl);
                }
            }else{
                endl=Math.abs(X-(X/D)*D);
                end=Math.abs(X-((X/D)+1)*D);
                if((K-X/D)%2==0){
                    System.out.println(end);
                }else{
                    System.out.println(endl);
                }
            }
        }
        else{
            System.out.println(Math.abs(X-D*K)<Math.abs(X+D*K)?X-D*K:X+D*K);
        }*/
    }
}
