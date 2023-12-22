import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] brick = new int[num];
        for(int i = 0; i < num; i++){
            brick[i] = sc.nextInt();
        }
        int currentnumber = 1;
        int count = 0;
        
        boolean check = false;

        
        for(int a:brick){
            if(a == 1){
                check = true;
            }
        }
        
        if(!check){
            System.out.println(-1);
            System.exit(0);
        }
        
        for(int i = 0; i < brick.length; i++){
            if(brick[i] != currentnumber){
                count++;
            }else{
                currentnumber++;
            }
        }
        System.out.println(count);
        
    }
}