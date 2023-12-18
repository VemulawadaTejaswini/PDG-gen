

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N =scanner.nextInt();
        String s = Integer.toString(N);
        int count = 0;
        for(int i = 0 ; i<s.length();i++){
        if(s.charAt(i) == '2'){
        count++;
        }
        }
        System.out.println(count);
    }
    
}
