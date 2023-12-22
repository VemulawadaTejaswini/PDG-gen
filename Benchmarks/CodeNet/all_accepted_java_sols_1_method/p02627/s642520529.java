import java.util.*;
 class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s=sc.nextLine().toCharArray()[0];
        boolean b=Character.isLowerCase(s);
        if(b){
            System.out.println("a");
        }
        else{
            System.out.println("A");
        }
    }
    
}