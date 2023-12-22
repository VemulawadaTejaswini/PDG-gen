import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        int h = stdIn.nextInt();
        int a = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //String t = stdIn.next();
        //char c[] = s.toCharArray();
        
        //c[0] += 1;
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
        
        if(h % a == 0){
            System.out.println(h / a);
        }else{
            System.out.println(h / a + 1);
        }
        
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}