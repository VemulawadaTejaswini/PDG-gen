import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        String[] sArray = new String[S.length()];
        for(int i = 0; i < S.length(); i++){
            String s2 = String.valueOf(S.charAt(i));
            sArray[i] = s2;
        }
        
        if(sArray[2].equals(sArray[3])){
            if(sArray[4].equals(sArray[5])){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        }else{
            System.out.print("No");
        }
        
    }
}