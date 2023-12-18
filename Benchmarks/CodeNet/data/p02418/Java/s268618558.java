import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String p = sc.next();

        int j = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == p.charAt(0)){
                int a = i;
                j = 0;
                while(true){
                    if(j == p.length())
                        break;
                    if(a + j == s.length())
                        a = -j;
                    if(s.charAt(a + j) != p.charAt(j))
                        break;
                    j++;
                }
                if(j == p.length())
                    break;
                else
                    j = 0;
            }
        }
        if(j == p.length())
            System.out.println("Yes");
        else
            System.out.println("No");

        sc.close();
    }
}
