import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String n = stdIn.next();
        String t = stdIn.next();
        int answer = 0;
        for(int i = 0; i < 3; i++){
            if(n.charAt(i) == t.charAt(i)) answer++; 
        }
        System.out.println(answer);
    }
}