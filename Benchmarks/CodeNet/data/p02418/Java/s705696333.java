import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String p = sc.nextLine();

        int num_s = s.length();
        s += s.substring(0,s.length() - 1);
        
        int yes = 0;
        for(int i = 0;i < num_s;i++){
            if((s.substring(i,(p.length() + i))).equals(p)) yes++;
        }

        if(yes > 0) System.out.println("Yes");
        else    System.out.println("No");
    }
}
