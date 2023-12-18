import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            for(int j = 0; j < s.length(); j++){
                char b;
                if(i == j){
                    continue;
                }
                b = s.charAt(j);
                if(a == b){
                    count++;
                    break;
                }
            }
        }
        if(count == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
	}
}