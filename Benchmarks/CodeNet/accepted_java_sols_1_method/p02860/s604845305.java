import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        
        sc.close();
        if(len%2!=0){
            System.out.println("No");
            return;
        }else{
            int half = len/2;
            for(int i=0;i+half<len;i++){
                if(s[i]!=s[i+half]){
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}