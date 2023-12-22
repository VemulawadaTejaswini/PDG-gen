import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer price = sc.nextInt();
        Integer change = 0;

        if (price % 1000 == 0){
          Integer count_bill = (price / 1000);
          change = ((count_bill * 1000) - price); 
        }
        else{
          Integer count_bill = (price / 1000) + 1;
          change = ((count_bill * 1000) - price); 
        }
        
        System.out.println(change);
    }
}