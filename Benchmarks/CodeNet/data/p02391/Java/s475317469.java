import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String s = String.valueOf(a);
        String i[] = a.split(" ");
        int d = Integer.parseInt(i[0]);
        int e = Integer.parseInt(i[1]);
        if(d < e){
        System.out.println("a < b");
        }else if (e < d){
        System.out.println("a > b");
        }else{
        System.out.println("a == b");
        }
        
    }
}    
          