import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int box[] = new int[3];
        
        for(int i = 0; i < box.length; i++){
            box[i] = sc.nextInt();
        }
        Arrays.sort(box);
        
        System.out.println(box[0] + " " + box[1] + " " + box[2]);
    }
}
