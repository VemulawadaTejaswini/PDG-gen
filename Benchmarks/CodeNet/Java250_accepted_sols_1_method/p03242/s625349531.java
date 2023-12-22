import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        //int n = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int k = stdIn.nextInt();
        String s = stdIn.next();
        char c[] = s.toCharArray();
        //boolean heisei = true;
        
        for(int i = 0; i < s.length(); i++){
            if(c[i] == '1'){
                System.out.print(9);
            }else{
                System.out.print(1);
            }
        }        
        
        System.out.println();
        //System.out.print();
    }
}
