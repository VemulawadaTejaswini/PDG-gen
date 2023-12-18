import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int xday = sc.nextInt();
        int before = sc.nextInt();
        int eat = sc.nextInt();
        int j = Math.abs(before - eat);
        
        if(before - eat >= 0){
            System.out.println("delicious");
        }else if(before - eat < 0 && j <= xday){
            System.out.println("safe");
        }else{
            System.out.println("dangerous");
        }
    }
}