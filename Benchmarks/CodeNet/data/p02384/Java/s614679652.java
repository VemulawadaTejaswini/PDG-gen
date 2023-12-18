import java.util.*;

public class Main {
    
    int[] lst = new int[6];
    
    void shake(char x){
        switch (x){
            case 'W':
                lst = new int[]{lst[2],lst[1],lst[5],lst[0],lst[4],lst[3]};break;
            case 'S':
                lst = new int[]{lst[4],lst[0],lst[2],lst[3],lst[5],lst[1]};break;
            case 'E':
                lst = new int[]{lst[3],lst[1],lst[0],lst[5],lst[4],lst[2]};break;
            case 'N':
                lst = new int[]{lst[1],lst[5],lst[2],lst[3],lst[0],lst[4]};break;
        }
    } 
    
    int rightCheck(int top ,int front){
        
        for(int i=0;i<3;i++){
            if(top==lst[0])break;
            shake('W');
        }
        for(int i=0;i<3;i++){
            if(top==lst[0])break;
            shake('S');
        }
        
        int[] x = {1,2,4,3}; int y=0 ;
        for(int i=0;i<4;i++){
            if(lst[x[i]] == front) y=x[(i+1)%4];
        }
        return this.lst[y];
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Main dice = new Main();
        for(int i=0;i<6;i++){
            dice.lst[i]=sc.nextInt();
        }
        
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println(dice.rightCheck(sc.nextInt(),sc.nextInt()));
        }
    }
}
