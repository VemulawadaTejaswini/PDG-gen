import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int jdg = Math.abs(a-b);
        if(jdg > 1){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
    }
}