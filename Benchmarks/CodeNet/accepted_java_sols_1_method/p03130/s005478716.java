import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] n = new int[6];
        int one=0;
        int two=0;
        int three=0;
        int four=0;
        
        for(int i=0; i<6; i++){
            n[i] = sc.nextInt();
            if(n[i]==1){
                one++;
            }else if(n[i]==2){
                two++;
            }else if(n[i]==3){
                three++;
            }else{
                four++;
            }
        }
        
        if(one<3 & two<3 && three<3 && four<3){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        
        
        
   }
}
