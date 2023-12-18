import java.util.Scanner;
 
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
  
        while(n != 0){
 
            System.out.println("Case" + " " + i + ":" + " " + n);
             
            i=i+1;
 
            n = sc.nextInt();
        }
    }
}