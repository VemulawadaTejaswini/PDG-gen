import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
      
        if(a<1200){
        System.out.println("ABC");
        }else if(a>2799){
           System.out.println("AGC");
        }else{
           System.out.println("ARC");
        }
     
    }
}