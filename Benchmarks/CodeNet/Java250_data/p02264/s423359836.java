import java.io.*;
class Que {
   int queStart;
   int queTail;
   int procTime;
   String[] arry;
   int elapsedTime;
   int max;
    public Que(int procTime,  int maxLen) {
        this.queStart = 0;
        this.queTail = 0;
        this.procTime = procTime;
        this.elapsedTime = 0;
        this.arry = new String[maxLen+1];
        this.max = maxLen+1;
    }
    public boolean isEmpty() {
        return queStart == queTail;
    }
    public boolean isFull() {
        return queStart == (queTail+1) % max;
    }
    public void enqueue (String arg){
        if(!(isFull())) {
            arry[queTail] = arg;
            queTail++;
            queTail %= max;
        } else {
            System.out.println("full");
        }
    }
    public String dequeue() {
        if(!isEmpty()){
            int now = queStart;
            queStart++;
            queStart %= max;
            return arry[now];
        } else {
            System.out.println("empty");
            return null;
        }
    }
    public void eval(Que que){
        String[]ary = que.dequeue().split(" ");
        String val = ary[0];
        int necessTime = Integer.parseInt(ary[1]);
        if(necessTime > procTime) {
            elapsedTime += procTime;
            que.enqueue(val+ " " + (necessTime-procTime));
        } else {
            elapsedTime += necessTime;
            System.out.println(val + " " + elapsedTime);
        }
    }
}

class Main {
    public static void main(String...args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] init = br.readLine().split(" ");
        int count = Integer.valueOf(init[0]);
        int procTime = Integer.valueOf(init[1]);
       
        int elapsedTime = 0;
        Que que = new Que(procTime, count);
        for(int i = 0; i < count; i++) {
            que.enqueue(br.readLine());
        }
        while(!que.isEmpty()){
            que.eval(que);
        }
    }
}
        

