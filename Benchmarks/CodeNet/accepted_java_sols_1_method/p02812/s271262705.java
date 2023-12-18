import java.util.Scanner;
 
public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
 
        //int a = stdIn.nextInt();
        //int b = stdIn.nextInt();
        //int c = stdIn.nextInt();
        //int x = stdIn.nextInt();
        //int num[] = new int[];
        //String s = stdIn.next();
        int gomi = stdIn.nextInt();
        String s = stdIn.next();
        char c[] = s.toCharArray();
        int count = 0;
        //int sum = 0;
        //boolean flag = true;
        for(int i = 0; i < s.length() - 2; i++){
            if(c[i] == 'A' && c[i + 1] == 'B' && c[i + 2] == 'C'){
                count++;
            }
        }
 
        System.out.println(count);
 
        //System.out.println();
        //System.out.print();
 
        stdIn.close();
    }
}