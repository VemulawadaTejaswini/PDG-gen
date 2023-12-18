import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class myStack {
    //s[0]には何も入れない
    int size = 200;
    String[] s;
    int top;
    
    myStack() {
        s = new String[size];
        top = 0;
    }
    
    void initialize() {
        top = 0;
    }
    
    void push(String x) {
        if(isFull()) {
            System.out.println("stack overflow!");
            return;
        }
        s[++top] = x;
    }
    
    String pop() {
        if(isEmpty()) {
            System.out.println("stack is empty!");
            return null;
        }
        return s[top--];
    }
    
    boolean isEmpty() {
        return (top == 0);
    }
    
    boolean isFull() {
        return (top >= size - 1);
    }
    
    int eval() {
        String val = this.pop();
        if(isNumber(val)) {
            return Integer.parseInt(val);
        }
        
        int y = eval();
        int x = eval();
        
        switch(val) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
        }
        return 0;
    }
    
    boolean isNumber(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        myStack ms = new myStack();
        
        for(String s : input) {
            ms.push(s);
        }
        
        //evalate
        while(ms.top != 1) {
            ms.push(String.valueOf(ms.eval()));
        }
        
        System.out.println(ms.pop());
    }
}
