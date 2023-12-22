import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int anc = 0;
        int seiseki[] = new int[L];
        for(int i = 0;i < L;i++){
            int a = sc.nextInt();
            seiseki [i] = a;
            if(i == 0 || i%2 == 0){
                if(a%2 != 0){
                    anc++;
                }
            }
        }
        
      
        System.out.println(anc);
    }
}
