import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   //スタック要素数
        int q = sc.nextInt();   //命令数

        ArrayList<Deque<Integer>> stack = new ArrayList<>();
        for(int i = 0;i < n;i++){
            stack.add(new ArrayDeque<>());
        }

        for(int i = 0;i < q;i++){
            int num = sc.nextInt(); //命令番号
            int t = sc.nextInt();   //指定スタック番号
            switch(num){
                case 0: //push
                    int x = sc.nextInt();
                    stack.get(t).add(x);
                    break;
                case 1: //top
                    if(stack.get(t).size() > 0)
                        System.out.println(stack.get(t).getLast());
                    break;
                case 2: //pop
                    if(stack.get(t).size() > 0)
                        stack.get(t).removeLast();
                    break;
            }
        }
    }
}


