import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        int cnt=0;
        for(int i=0; i<3; i++){
            if(S[i] == T[i]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}