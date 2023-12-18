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
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Main dice = new Main();
        for(int i=0;i<6;i++){
            dice.lst[i]=sc.nextInt();
        }
        
        String s = sc.next();
        
        for(int i=0;i<s.length();i++){
            dice.shake(s.charAt(i));
        }
        
        System.out.println(dice.lst[0]);
    }
}
