import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String a = scan.nextLine();
        String b = scan.nextLine();
        String a2 = a + a;
        
        if(a2.contains(b)){
            
            System.out.println("Yes");
            
        }else{
        
            System.out.println("No");
            
        }
        
    }
}
