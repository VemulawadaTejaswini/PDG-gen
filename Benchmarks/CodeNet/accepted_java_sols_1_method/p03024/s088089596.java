import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int N = sc.nextInt();
        String str = sc.nextLine();
        char c[] = str.toCharArray();
        int count = 0;
        
        for(int i = 0; i < c.length; i++){
           if(c[i] == 'x'){
               count++;
           }
        }
        if(count < 8){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}
