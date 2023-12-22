import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char sn[] = s.toCharArray();

        for(int i=0; i <s.length();i++){
            for(int j=1; j<=n; j++){
                sn[i]++;
                if(Objects.equals(sn[i], '[')){
                    sn[i] = 'A';
                }
            }
            System.out.print(sn[i]);
        }


        
    }
}