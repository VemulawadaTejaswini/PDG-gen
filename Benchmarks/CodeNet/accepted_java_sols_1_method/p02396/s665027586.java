import java.util.*;

public class Main{
    public static void main(String[] args){
        /*
        List<Integer> list = new ArrayList<>();
        int input_int_number;
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        input_int_number = sc.nextInt(); 
        list.add(input_int_number);
        }
        for(Integer num :list){
            cnt++;
            System.out.println("Case "+cnt+": "+num);
        }
        */
        int input_int_number;
        int cnt=0;
        Scanner sc = new Scanner(System.in);
        while((input_int_number=sc.nextInt())!=0){
            cnt++;
            System.out.println("Case "+cnt+": "+input_int_number);
        }
    }
}
