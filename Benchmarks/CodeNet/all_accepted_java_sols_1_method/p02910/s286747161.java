import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final String S = scan.next();
        scan.close();
        int length = S.length();
        String moji;
        String result = "Yes";
        for(int i = 1; i <= length; i++){
            moji = S.substring(i - 1, i);
            if(i % 2 == 1){
                if(moji.equals("R") || moji.equals("U") || moji.equals("D")){
                    // OK
                }else{
                    result = "No";
                    break;
                }
            }else{
                if(moji.equals("L") || moji.equals("U") || moji.equals("D")){
                    // OK
                }else{
                    result = "No";
                    break;
                }
            }
        }
        System.out.println(result);
        

    }
        
    
}
