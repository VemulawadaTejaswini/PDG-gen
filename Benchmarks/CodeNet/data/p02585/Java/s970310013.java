import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] P=new int[N];
        for(int i=0;i<N;i++){
            P[i]=sc.nextInt()-1;
        }
        ArrayList<Integer>C=new ArrayList<>();
        for(int i=0;i<N;i++){
            C.add(sc.nextInt());
        }

        ArrayList<ArrayList<Long>>L=new ArrayList<>();
        int start=0;
        int pos=0;
        int now=0;
        ArrayList<Long>tmp=new ArrayList<>();
        L.add(tmp);
        for(int i=0;i<N;i++){
            if(tmp.size()==0){
                tmp.add((long)C.get(now));
            }else{
                tmp.add(tmp.get(tmp.size()-1)+C.get(now));
            }
            C.set(now,null);
            if(C.get(P[now])!=null){
                now=P[now];
            }else{
                for(int j=start;j<N;j++){
                    if(C.get(j)!=null){
                        start=j;
                        now=j;
                        tmp=new ArrayList<>();
                        L.add(tmp);
                        break;
                    }
                }
            }
        }
        long result=-9223372036854775807l;

        for(ArrayList<Long>list:L){

            int a=list.size();
            long loopScore=0;
            loopScore=list.get(list.size()-1)*((K-1)/(long)a);

            int c=(K-1)%a+1;
            for(int j=0;j<list.size();j++){
                for(int k=1;k<=c;k++){
                    long score=0;
                    if(loopScore>0){
                        score=loopScore+list.get((j+k)%a)-list.get(j);
                    }else{
                        score=list.get((j+k)%a)-list.get(j);
                    }
                    if(j+k>=a){
                        score+=list.get(list.size()-1);
                    }
                    if(score>result){
                        result=score;
                    }

                }
            }

        }
        System.out.println(result);




    }
}