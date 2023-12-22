import java.io.*;
class Main {
    public static  void main(String...args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] formula = br.readLine().split(" ");
        Stack stack = new Stack(formula.length);
        for(String element : formula) {
            if(element.matches("[0-9]*?") ){
                int elem = Integer.parseInt(element);
                stack.push(elem);
            } else {
                int left = stack.pop();
                int right = stack.pop();
                switch (element) {
                    
                    case "+":
                        stack.push(right + left);
                        break;
                    case "-":
                        stack.push(right - left);
                        break;
                    case "*":
                        stack.push(right * left);
                        break;
                    case "/":
                        stack.push(right / left);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
    }
}
class Stack {
        int maxLen;
        int point;
        int [] stackAry;
    public  Stack(int maxLen) {
        this.maxLen = maxLen;
        this.point = 0;
        this.stackAry = new int[maxLen];
   }
    
    public boolean isEmpty() {
        return point == 0;
   }

    public boolean isFull() {
        return point >= maxLen-1;
    }

    public void push(int x) {
        if(isFull()) {
            System.out.println(x + "はプッシュできません");
        } else {
            stackAry[++point] = x;
        }
    }
    public int pop() {
        if(isEmpty()) {
            System.out.println("要素がからです");
            return 0;
        } else {
            point--;
            return this.stackAry[point+1];
        }
    }
}
        

        


