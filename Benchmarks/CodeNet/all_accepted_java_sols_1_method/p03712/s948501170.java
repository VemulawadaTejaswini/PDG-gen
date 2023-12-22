import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    String[]S = new String[h];
         
    for(int i=0; i<h; i++) {
    	S[i] = sc.next();
    }
    for(int i=0; i<w+1; i++) {
        System.out.print('#');
    }
    	System.out.println('#');
    for(int i=0; i<h; i++) {
    	System.out.println('#' + S[i] + '#');
    }
    for(int i=0; i<w+2; i++) {
        System.out.print('#');
}
}
    }