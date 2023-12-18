import java.io.*;
import java.util.Stack;

class Main{
    static int n,m,ans=0;
    
    static Stack<Integer> stackA_ini;
    static Stack<Integer> stackB_ini;
    static Stack<Integer> stackC_ini;
    
    static Stack<Integer> stackA;
    static Stack<Integer> stackB;
    static Stack<Integer> stackC;
    
    public static void main(String[] a)throws IOException{
        while(true){
            inputData();
            ans = Math.min(calcFromLeft(),calcFromRight());
            ans = (ans <= m) ? ans : -1;               
            System.out.println(ans);
        }
        
    }
    
    static int calcFromLeft(){
        int step = 0;
        
        //左初動
        while(true){
            // 終了判定
            if(isFinished()) break;
 
            // 左２つのコップで入れ替え
            if(peekStack(stackA)>peekStack(stackB))
                stackB.push(stackA.pop());
            else
                stackA.push(stackB.pop());
            
            step++;
            
            // 終了判定
            if(isFinished()) break;
                
            // 右２つのコップで入れ替え
            if(peekStack(stackB)>peekStack(stackC))
                stackC.push(stackB.pop());
            else
                stackB.push(stackC.pop());
            
            step++;
        }
        return step;
    }
    
    static int calcFromRight(){
        
        int step = 0;
        stackA = stackA_ini;
        stackB = stackB_ini;
        stackC = stackC_ini;
                 
        //右初動
        while(true){     
            // 終了判定
            if(isFinished()) break;
            
            // 右２つのコップで入れ替え
            if(peekStack(stackB)>peekStack(stackC))
                stackC.push(stackB.pop());
            else
                stackB.push(stackC.pop());

            step++;
            
            // 終了判定
            if(isFinished()) break;          
            
            // 左２つのコップで入れ替え
            if(peekStack(stackA)>peekStack(stackB))
                stackB.push(stackA.pop());
            else
                stackA.push(stackB.pop());
            
            step++;
        }
        return step;
    }
      
    static boolean isFinished(){
        if(stackB.empty() && (stackA.empty() || stackC.empty()))
            return true;
        else
            return false;
    }
    
    static int peekStack(Stack<Integer> stack){
        return stack.empty() ? 0:stack.peek();      
    }
    
    static void inputData() throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = in.readLine().split(" ");
        String[] cupList;
        int cupNum = 0;

        stackA = new Stack<Integer>();
        stackB = new Stack<Integer>();
        stackC = new Stack<Integer>();
        stackA_ini = new Stack<Integer>();
        stackB_ini = new Stack<Integer>();
        stackC_ini = new Stack<Integer>();
        
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        
        if(n+m == 0){
            System.exit(0);
        }
        
        cupList = in.readLine().split(" ");
        for(int j=0; Integer.parseInt(cupList[0])>j; j++){
            stackA_ini.push(Integer.parseInt(cupList[j+1]));
            stackA.push(Integer.parseInt(cupList[j+1]));
        }

        cupList = in.readLine().split(" ");
        for(int j=0; Integer.parseInt(cupList[0])>j; j++){
            stackB_ini.push(Integer.parseInt(cupList[j+1]));
            stackB.push(Integer.parseInt(cupList[j+1]));
        }
        
        cupList = in.readLine().split(" ");
        for(int j=0; Integer.parseInt(cupList[0])>j; j++){
            stackC_ini.push(Integer.parseInt(cupList[j+1]));
            stackC.push(Integer.parseInt(cupList[j+1]));
        }
    }
}