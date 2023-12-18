import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String p = scanner.nextLine();
        
        String custom_a = a + a;
        if(custom_a.indexOf(p) != -1){
            System.out.println("Yes");  
        } else {
            System.out.println("No");
        }
    }
}
