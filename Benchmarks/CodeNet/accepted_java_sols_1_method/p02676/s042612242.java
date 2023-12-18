import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int k = stdIn.nextInt();
        String s = stdIn.next();
        if(k > 0 && k < 101){
            if(s.length() > 0 && s.length() < 101){
                if(s.length() > k){
                    char[] x = new char[s.length()];
                    for(int i = 0 ; i < k ; i++){
                        x[i] = s.charAt(i);
                        System.out.print(x[i]);
                    }
                    System.out.println("...");
                }else{
                    System.out.println(s);
                }
            }
        }
    }
}
