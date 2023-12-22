import java.util.*;

class CPU{
    int time;
    String name;
}

public class Main {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Queue<CPU> que = new LinkedList<>();
        int n = sc.nextInt();
        CPU[] cc = new CPU[n];
        int q = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String[] tt = sc.nextLine().split(" ");
            cc[i] = new CPU();
            cc[i].name = tt[0];
            cc[i].time = Integer.parseInt(tt[1]);
            que.add(cc[i]);
        }
        int tot=0;
        while(!que.isEmpty()){
            CPU now = que.poll();//返回第一个元素，并删除
            if(now.time > q){
                now.time -= q;
                que.add(now);
                tot += q;
            }
            else{
                tot += now.time;
                System.out.println(now.name + " " + tot);
            }
        }
    }

}

