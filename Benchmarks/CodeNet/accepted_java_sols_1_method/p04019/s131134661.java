import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int[] news = new int[4];
        Arrays.fill(news , 0);
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'N') news[0]++;
            if(s.charAt(i) == 'S') news[1]++;
            if(s.charAt(i) == 'W') news[2]++;
            if(s.charAt(i) == 'E') news[3]++;
        }
        boolean ebishu = true;
        if(news[0] == 0 && news[1] != 0){
            ebishu = false;
        }else if(news[0] != 0 && news[1] == 0){
            ebishu = false;
        }else if(news[2] != 0 && news[3] == 0){
            ebishu = false;
        }else if(news[2] == 0 && news[3] != 0){
            ebishu = false;
        }
        if(ebishu){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}