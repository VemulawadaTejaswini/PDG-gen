import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Dice[] list = new Dice[n];
        
        for(int i = 0; i < n; i++) {
            list[i] = new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        
        for(int i = 0; i < n; i++) {
        	
            for(int j = i+1; j < n; j++) {
            	
                if(solve(list[i],list[j],0)) {
                    System.out.println("No");
                    return;
                }
            }
        }
        
        System.out.println("Yes");
    }
    
    public static boolean solve(Dice f, Dice dice,int count) {
    	
        if(dice.Top == f.Top && dice.S == f.S && dice.Bottom == f.Bottom && dice.E == f.E && dice.N == f.N && dice.W == f.W)
        	return true;
        
        if(count == 6) 
        	return false;
        
        Dice tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
        tmp.TurnN();
        
        if(solve(f,tmp,count+1)) {
            return true;
        }
        
        tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
        
        if(solve(f,tmp,count+1)) {
            return true;
        }
        
        tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
        tmp.TurnE();
        tmp = new Dice(dice.Top,dice.S,dice.E,dice.W,dice.N,dice.Bottom);
        tmp.TurnW();
        
        if(solve(f,tmp,count+1)) {
            return true;
        }
          
        return false;
    } 
}
  
class Dice {
    int Top;
    int Bottom;
    int N;
    int S;
    int W;
    int E;
    
    Dice(int a, int b, int c, int d, int e, int f) {
        Top = a;
        S = b;
        E = c;
        W = d;
        N = e;
        Bottom = f;
    }
    
    public void TurnN() {
        int tmp = Top;
        Top = S;
        S = Bottom;
        Bottom = N;
        N = tmp;
    }
    
    public void TurnW() {
        int tmp = Top;
        Top = E;
        E = Bottom;
        Bottom = W;
        W = tmp;
    }
    
    public void TurnE() {
        int tmp = Top;
        Top = W;
        W = Bottom;
        Bottom = E;
        E = tmp;
    }
    
    public void TurnS() {
        int tmp = Top;
        Top = N;
        N = Bottom;
        Bottom = S;
        S = tmp;
    }
}

