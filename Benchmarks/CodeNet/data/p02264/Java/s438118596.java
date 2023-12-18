import java.util.*;

////queue for round robin
public class Main{
    int processid = 0;
    int val = 0;
    Main(int a, int b){
        processid = a;
        val = b;
    }

    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int quantum = in.nextInt();
        int[] name = new int[n+1];
        Main[] res = new Main[n+1];
        res[0] = new Main(0,1000050);
        Queue<Main> q = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            in.next();
            name[i] =  in.nextInt();
            q.offer(new Main(i,name[i]));
            Main temp = new Main(i,0);
            res[i] = temp;
        }
        //System.out.println(res.length);
        //howto deal with p1, p2, p3

        int count = 1;
        int length = n;
        int save = 0;
        while(!q.isEmpty()){
            //if(count>q.size()) count = 0;
            Main temp = q.poll();
            if(temp.val<=quantum){ //
                save += (quantum - temp.val);
                res[temp.processid].val+=(count*quantum-save);

            }else if(temp.val > quantum){
                temp.val = temp.val-quantum;
                q.offer(temp);
                //res[temp.processid].val+=(quantum);
            }
            count++;
        }

        Arrays.sort(res, new Comparator<Main>() {
            @Override
            public int compare(Main o1, Main o2) {
                return o1.val-o2.val;
            }
        });
        for(int i = 0; i<n; i++){
            System.out.println("p"+res[i].processid+" "+res[i].val);
        }

    }
}

