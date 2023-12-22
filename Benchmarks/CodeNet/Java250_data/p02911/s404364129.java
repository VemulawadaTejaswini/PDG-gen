import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt(),//人数
        K=sc.nextInt(),//ポイント
        point[] = new int[N],
        Q=sc.nextInt();//回数
        //A[] = new int[N];//そのラウンドで正解した人
        Arrays.fill(point,0);
        for(int i=0;i<Q;i++) {
            point[sc.nextInt()-1]++;
        }
        for(int i=0;i<N;i++){
                System.out.println(point[i]-Q+K>0?"Yes":"No");
        }
    }
}