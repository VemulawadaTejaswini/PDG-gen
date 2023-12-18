import java.util.Scanner;

class Cube{
    int[] f;
    Cube(int[] Dice){
        f = new int[6];
        for(int i=0;i<6;i++){
            f[i] = Dice[i];
        }
    }
    
    void roll_z(){
        roll(1,2,4,3);
    }
    void roll_y(){
        roll(0,2,5,3);
    }
    void roll_x(){
        roll(0,1,5,4);
    }
    void roll(int i,int j,int k,int l){
        int t = f[i];
        f[i] = f[j];
        f[j] = f[k];
        f[k] = f[l];
        f[l] = t;
    }
    int getRight(int f0, int f1){
        
        for(int i=0;i < 6;i++){
            for(int j=0;j < 4; j++){
                if(f[0] == f0 && f[1] == f1) return f[2];
                roll_z();
            }
            if(i % 2 == 0)roll_y();
            else roll_x();
        }
        
        return -1;
    }
}

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int[] dice = new int[6];
        
        for(int i=0;i<6;i++){
            dice[i] = sc.nextInt();
        }
        
        Cube CB = new Cube(dice);
        
        int q = sc.nextInt();
        
        for(int i=0;i<q;i++){
            
            int Up = sc.nextInt();
            int Front = sc.nextInt();
            
            int ans = CB.getRight(Up , Front);
            
            System.out.println(ans);
        }
    }
}
                
