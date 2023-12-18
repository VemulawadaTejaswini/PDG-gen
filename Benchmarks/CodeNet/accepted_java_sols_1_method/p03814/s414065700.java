import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int iA = 0;
        while(s.charAt(iA) != 'A'){
            ++iA;
        }
        
        int iZ = s.length()-1;
        while(s.charAt(iZ) != 'Z'){
            --iZ;
        }

        int ans = iZ - iA + 1;

        System.out.println(ans);
    }
}

