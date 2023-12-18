import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.next();
        char[] c = n.toCharArray();
        
        int sum = 0;
        for(char c2: c){
            sum += (c2 - '0');
        }
        
        if(sum % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}