import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        String n[] = new String[N];
        int ans = 0;
        int count0 = 0;
        int count1 = 0;
        
        for(int i = 0 ; i < N ; i++){
                n[i] = String.valueOf(S.charAt(i));
                if(n[i].equals("0")){
                    count0++;
                }else if(n[i].equals("1")){
                    count1++;
                }
        }      
        
        if(count0 == count1){
            ans = N;
        }else if(count0 > count1){
            ans = count1 * 2;
        }else{
            ans = count0 * 2;
        }
        
        System.out.print(ans);
        
    }
    
}
