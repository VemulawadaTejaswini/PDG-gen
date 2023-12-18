import java.util.*;

////queue for round robin
public class Main{
    String processid ;
    int id = 0;
    int val = 0;
    Main(String a, int b,int c){
        processid = a;
        val = b;
        id = c;
    }

    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int quantum = in.nextInt();
        int[] name = new int[n+1];
        Main[] res = new Main[n+1];
        res[0] = new Main("test",1000050,0);

        Queue<Main> q = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            String te = in.next();
            name[i] =  in.nextInt();
            q.offer(new Main(te,name[i], i));
            Main temp = new Main(te,0, i);
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
                res[temp.id].val+=(count*quantum-save);

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
            System.out.println(res[i].processid+" "+res[i].val);
        }

    }
}

