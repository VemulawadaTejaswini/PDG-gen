import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String Ans = "";
        int l = Str.length();
        int i;
        char c1,c2;
        for(i=0;i<l;i++){
            c1 = Str.charAt(i);
            if(Character.isLowerCase(c1) == true) {
                c2 = Character.toUpperCase(c1);
            }else{
                c2 = Character.toLowerCase(c1);
            }
            Ans += c2;
        }
        System.out.println(Ans);
    }
}

