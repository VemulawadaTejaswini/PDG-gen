import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        scanner.close();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
 
        int sum = 0;
        for(int i = 0; i < 3; i++){
            if(sChar[i]==tChar[i]){
                sum++;
            }
        }
        System.out.println(sum);
    }
}