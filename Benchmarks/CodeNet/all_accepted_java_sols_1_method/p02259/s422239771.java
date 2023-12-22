import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] List = new int [N];
        for(int i=0;i<N;i++) List[i] = sc.nextInt();
        boolean flag = true;
        int num = 0, opt = 0;
        while(flag){
            flag = false;
            for(int i=N-1;i>num;i--){
                if(List[i]<List[i-1]){
                    int now = List[i];
                    List[i] = List[i-1];
                    List[i-1] = now;
                    flag = true;
                    opt++;
                }
            }
            num++;
        }
        for(int i=0;i<N;i++){
            if(i<N-1) System.out.print(List[i]+" ");
            else System.out.println(List[i]);
        }
        System.out.println(opt);
    }
}
