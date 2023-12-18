import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        int[] A=new int[N];
        int minIndex=0;
        for(int i=0;i<N;i++){
            A[i]=scanner.nextInt();
            if(A[i]==1){
                minIndex=i;
            }
        }
        int result1=0;
        int result2=0;
        int left=minIndex;
        int right=minIndex;
        while(true){
            if(left<=0){
                right=right-left;
                break;
            }
            left=left-K+1;
            //System.out.println("new left"+left);
            result1++;
        }
        while(true){
            if(right>=N-1){
                break;
            }
            right=right+K-1;
            //System.out.println("new right"+right);
            result1++;
        }
        
        left=minIndex;
        right=minIndex;
        while(true){
            if(right>=N-1){
                break;
            }
            right=right+K-1;
            //System.out.println("new right"+right);
            result2++;
        }
        while(true){
            if(left<=0){
                right=right-left;
                break;
            }
            left=left-K+1;
            //System.out.println("new left"+left);
            result2++;
        }
        
        System.out.println(Math.min(result1,result2));
    }
}
