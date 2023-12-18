import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int N = scan.nextInt();
                int M = scan.nextInt();
                int K = scan.nextInt();
               
                ArrayList<Integer> A = new ArrayList<>();
                ArrayList<Integer> B = new ArrayList<>();
                for(int i=0; i<N;i++){
                        int P = scan.nextInt();
                        A.add(P);
                }
                for(int i=0; i<M;i++){
                        int Q = scan.nextInt();
                        B.add(Q);
                }
                long cnt = 0;
                long time = 0;
                int as = 0;
                int bs = 0;
                while(time<K){
                    if(as<A.size()&&bs<B.size()){
                        if(A.get(as)<=B.get(bs)){
                            cnt++;
                            time = time + A.get(as);
                            as++;
                        }else{
                            cnt++;
                            time = time + B.get(bs);
                            bs++;
                    }
                    }else if(as>=A.size()&&bs<B.size()){
                        cnt++;
                        time = time + B.get(bs);
                        bs++;
                    }else if(as<A.size()&&bs>=B.size()){
                        cnt++;
                        time = time + A.get(as);
                        as++;
                    }else{
                        cnt++;
                        break;
                    }
                }
                if(A.size()+B.size()!=cnt){
                    cnt--;
                }
                System.out.println(cnt);
        }               
}