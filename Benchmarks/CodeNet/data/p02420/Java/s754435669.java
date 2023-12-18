import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        String s = sc.next();
        if(s.equals("-")){
            break;
        }
        int m = sc.nextInt();
         List<Character> str = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            str.add(s.charAt(i));
        }  
        for(int i = 0; i < m; i++){
            int h = sc.nextInt();
            for(int j = 0; j < h; j++){
                str.add(str.get(0));
                str.remove(0);
            }
        }
        for(char c : str){
        System.out.print(c);
        }
            System.out.println("");
        }
    }
}