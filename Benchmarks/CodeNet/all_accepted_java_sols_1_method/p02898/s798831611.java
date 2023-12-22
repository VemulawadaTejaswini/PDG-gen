import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int man = 0;
        int ret = 0;
        for(int i =0 ; i < n ; i++){
            man = sc.nextInt();
            if(man >= k ){
                ret++;
            }
        }
        System.out.println(ret);
        sc.close();
    }
}
