import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// スペース区切りの整数の入力
        int N=sc.nextInt();
        int K=sc.nextInt();
        Integer[] p=new Integer[N];
		for( int i=0;i<N;i++){
          p[i]=sc.nextInt();
        }
        Arrays.sort(p);
        int syutu=0;
        for(int i=0;i<K;i++){
          syutu=syutu+p[i];
        }
        System.out.println(syutu);
}
}