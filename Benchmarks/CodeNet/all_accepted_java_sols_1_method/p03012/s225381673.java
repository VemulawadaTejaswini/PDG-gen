import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int[] lst = new int[n];
        int one_weigh = 0;
        int two_weigh = 0;
        int div = 0;
        for(int a=0; a<n; a++){
            lst[a] = Integer.parseInt(scan.next());
        }
        for(int a=0; a<n; a++){
            two_weigh += lst[a];
        }
        for(int a=0; a<n; a++){
            div = one_weigh - two_weigh;
            one_weigh += lst[a];
            two_weigh -= lst[a];
            if(one_weigh - two_weigh==0){
                System.out.println(0);
                break;
            }else if(one_weigh - two_weigh>0){
                if(div*(-1)>one_weigh - two_weigh){
                    System.out.println(one_weigh - two_weigh);
                }else{
                    System.out.println(div*(-1));
                }
                break;
            }
        }
    }
}