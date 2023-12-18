import java.io.*;
import java.util.ArrayList;

class Main{
    static int n,m,ans=0;
    
    static ArrayList<Integer> stackA_ini ;    
    static ArrayList<Integer> stackB_ini ;    
    static ArrayList<Integer> stackC_ini ;    
    
    static ArrayList<Integer> stackA;
    static ArrayList<Integer> stackB;
    static ArrayList<Integer> stackC;    
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
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
            if(peekStack(stackA)>peekStack(stackB)){
                stackB.add(stackA.get(stackA.size()-1));
                stackA.remove(stackA.size()-1);
            }else{
                stackA.add(stackB.get(stackB.size()-1));
                stackB.remove(stackB.size()-1);
            }
            
            step++;
            
            // 終了判定
            if(isFinished()) break;
                
            // 右２つのコップで入れ替え
            if(peekStack(stackB)>peekStack(stackC)){
                stackC.add(stackB.get(stackB.size()-1));
                stackB.remove(stackB.size()-1);
            }else{
                stackB.add(stackC.get(stackC.size()-1));
                stackC.remove(stackC.size()-1);
            }
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
            if(peekStack(stackB)>peekStack(stackC)){
                stackC.add(stackB.get(stackB.size()-1));
                stackB.remove(stackB.size()-1);
            }else{
                stackB.add(stackC.get(stackC.size()-1));
                stackC.remove(stackC.size()-1);
            }
            step++;
            
            // 終了判定
            if(isFinished()) break;          
            
            // 左２つのコップで入れ替え
            if(peekStack(stackA)>peekStack(stackB)){
                stackB.add(stackA.get(stackA.size()-1));
                stackA.remove(stackA.size()-1);
            }else{
                stackA.add(stackB.get(stackB.size()-1));
                stackB.remove(stackB.size()-1);
            }
            
            step++;
        }
        return step;
    }
      
    static boolean isFinished(){
        if(stackB.isEmpty() && (stackA.isEmpty() || stackC.isEmpty()))
            return true;
        else
            return false;
    }
    
    static int peekStack(ArrayList<Integer> stack){
        return stack.isEmpty() ? 0:stack.get(stack.size()-1);      
    }
    
    static void inputData() throws IOException{
        
        String[] nm = in.readLine().split(" ");
        String[] cupList;
        int cupNum = 0;
        
        stackA = new ArrayList<Integer>();
        stackB = new ArrayList<Integer>();
        stackC = new ArrayList<Integer>();
        stackA_ini = new ArrayList<Integer>();
        stackB_ini = new ArrayList<Integer>();
        stackC_ini = new ArrayList<Integer>();        
        
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        
        if(n+m == 0){
            System.exit(0);
        }
        
        cupList = in.readLine().split(" ");
        for(int j=0; Integer.parseInt(cupList[0])>j; j++){
            stackA_ini.add(Integer.parseInt(cupList[j+1]));
            stackA.add(Integer.parseInt(cupList[j+1]));
        }

        cupList = in.readLine().split(" ");
        for(int j=0; Integer.parseInt(cupList[0])>j; j++){
            stackB_ini.add(Integer.parseInt(cupList[j+1]));
            stackB.add(Integer.parseInt(cupList[j+1]));
        }
        
        cupList = in.readLine().split(" ");
        for(int j=0; Integer.parseInt(cupList[0])>j; j++){
            stackC_ini.add(Integer.parseInt(cupList[j+1]));
            stackC.add(Integer.parseInt(cupList[j+1]));
        }
    }
}