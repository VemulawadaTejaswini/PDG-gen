import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int min=100000;
        for(int i=0;i<5;i++) { 
            int x = sc.nextInt(); 
            max=Math.max(max, x);
            min=Math.min(min, x);
        }
        int k=sc.nextInt();
        if(max-min>k){
        System.out.println(":(");
        }
        else{
            System.out.println("Yay!");
        }
    }  
}
