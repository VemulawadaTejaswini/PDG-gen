import java.util.Scanner;

class Main {
    public void cubic() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
  //      System.out.println(a*b);
        System.out.println(a*b+" "+(a*2+b*2));
    }
    
    public static void main(String[] args){
    new Main().cubic();
    }
}