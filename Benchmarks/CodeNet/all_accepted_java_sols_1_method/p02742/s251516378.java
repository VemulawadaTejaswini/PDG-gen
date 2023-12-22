import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        
        //int num[] = {1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        long h = stdIn.nextInt();
        long w = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        //String t = stdIn.next();
        if(h == 1 || w == 1){
            System.out.println(1);
        }else{
            if((h * w)% 2 == 0){
                long l = h * w / 2;
                System.out.println(l);
            }else{
                long l = h * w / 2 + 1;
                System.out.println(l);
            }
        }
        
        
        //int sum = 0;
        //boolean flag = true;
        //for(int i = 0; i < s.length(); i++){
        //}
 
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}