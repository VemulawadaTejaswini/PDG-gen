import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        String s = sc.next();
        
        int happy = 0;
        int lr = 0;
        int rl = 0;
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) == 'L'){
                if(s.charAt(i+1) == 'R'){
                    lr++;
                }else{
                    happy++;
                }
            }else{
                if(s.charAt(i+1) == 'L'){
                    rl++;
                }else{
                    happy++;
                }
            }
        }
        
        happy += Math.min(k, Math.min(lr, rl)) *2;
        if(k > Math.min(lr, rl)){
            happy += Math.min(k - Math.min(lr, rl), Math.abs(lr - rl));
        }
        System.out.println(happy);
    }
}