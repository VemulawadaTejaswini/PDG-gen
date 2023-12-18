

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    //    \:0  /:1 _:-1
    static class M {
        Integer flag;
        Integer loc;

        public M(Integer flag, Integer loc) {
            this.flag = flag;
            this.loc = loc;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Deque<M> deque = new ArrayDeque<M>();
        Deque<M> deque1 = new ArrayDeque<M>();
        int po = 0;//记录位置
        int sum = 0;
        String s = bf.readLine();
        bf.close();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '\\') {
                deque.push(new M(0, po));
                po++;
            } else if (a == '/') {
                while (!deque.isEmpty()) {
                    M pop = deque.pop();
                    if (pop.flag == 0) {
                        int area = po - pop.loc;
                        sum += area;
                        while (!deque1.isEmpty()){
                            M pop1 = deque1.peek();
                            if (pop1.flag>pop.loc){
                                pop1=deque1.pop();
                                area+=pop1.loc;
                            }else {
                                break;
                            }
                        }
                        deque1.push(new M(pop.loc, area));
                        break;
                    }
                }
                po++;
            } else {
                po++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        System.out.println(sum);
        sb.append(deque1.size()+" ");
        while (!deque1.isEmpty()){
            sb.insert(2,deque1.pop().loc+" ");
        }
        sb.deleteCharAt(sb.lastIndexOf(" ") );
        bw.write(sb.toString());
        bw.newLine();
        bw.close();

    }
}

