import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        String str1 = S.substring(0, 1);
        String str2 = "";
        String str3 = "none";
        boolean hantei = false;
        for(int i = 1; i < S.length(); i++){
            if(str1.equals(S.substring(i, i+1))){
                hantei = true;
            }else{
                if(str2.equals("")){
                    str2 = S.substring(i, i+1);
                }else{
                    str3 = S.substring(i, i+1);
                }
            }
        }
        if(str2.equals(str3) && hantei){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
