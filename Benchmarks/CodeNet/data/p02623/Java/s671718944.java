import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        long[] A = new long[N+1];
        long[] B = new long[M+1];
        for (int i = 0; i < N; i++) {
            A[i+1] = A[i]+sc.nextInt();
        }
        TreeMap<Long,Integer> s = new TreeMap<>();
        s.put(0L,0);
        for (int i = 0; i < M; i++) {
            B[i+1] = B[i]+sc.nextInt();
            s.put(B[i+1],i+1);
        }

        int ans = 0;
        for (int i = 0; i <=N ; i++) {

            if(A[i]>K){
 //               ans = Math.max(ans,i);
            }else if(A[i]==K){
                  ans = Math.max(ans,i);
            }else{
                int books = binarySearch(A[i],K,s);
                ans = Math.max(ans,books+i);
            }
        }

        System.out.println(ans);
    }

    //a-B[i]<= K , find max books
//    static
//    int binarySearch(long a,int K, long[] B){
//        int l = 0;
//        int r = B.length;
//
//        while(l+1<r){
//            int mid = (l+r)/2;
//            if(a+B[mid]<=K){ //OK
//                l=mid;
//            }else{//NG
//                r=mid;
//            }
//        }
//        return l;
//    }
    static
    int binarySearch(long a,int K, TreeMap<Long,Integer> B){
        if(B.containsKey(K-a)){
            return B.get(K-a);
        }else{
            Long books =  B.lowerKey(K-a);
            if(books==null){
                return 0;
            }else{
                return B.get(books);
            }
        }
    }
}