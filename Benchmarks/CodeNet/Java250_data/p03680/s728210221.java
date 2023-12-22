import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        int[] b = new int[a];
        for(int i = 0;i<a;i++){
            b[i] = sc.nextInt();
        }
        int go = b[0];
        int flag = 0;
        int count = 0;
        for(int i = 0;i<a;i++){
            ++count;
            if(go == 2){
                flag = 1;
                break;
            }
            go = b[go-1];
        }
        if(flag == 1){
            System.out.println(count);
        }else{
            System.out.println(-1);
        }
    }
}