import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        String s = stdIn.next();
        char[] cs = s.toCharArray();
        int [] flag = new int [26];
        int containTwo = 0;
        
        for(int i=0; i<cs.length; i++){
            flag['Z'-cs[i]]++;
        }
        for(int i=0; i<flag.length; i++){
            if(flag[i] == 2){
                containTwo++;
            }
        }

        if(containTwo == 2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}