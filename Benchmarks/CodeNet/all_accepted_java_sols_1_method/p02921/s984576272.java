import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String[] s2 = s.split("");
        String t = scn.nextLine();
        String[] t2 = t.split("");
        int cnt = 0;
        for(int i=0;i<3;i++){
            if(s2[i].equals(t2[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}