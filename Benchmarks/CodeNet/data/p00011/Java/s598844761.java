import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String code = sc.nextLine();
//        String answer = "";

        int box[] = new int[30];
        int x=0;       
        int w  = sc.nextInt();
        int n  = sc.nextInt();
        
        for(int i=0;i<w;i++){
            box[i] = i + 1;
        }

        for(int i=0;i<n;i++){
            int a  = sc.nextInt();
            int b  = sc.nextInt();
            x = box[a-1];
            box[a-1] = box[b-1];
            box[b-1] = x;
        }

        for(int i=0;i<w;i++){
            System.out.println(box[i]);
        }

        sc.close();
    }
}
