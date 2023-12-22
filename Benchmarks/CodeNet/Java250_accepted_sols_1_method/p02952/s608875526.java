import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        //1桁
        if(N/10 == 0){
            System.out.println(N%10);
        //2桁
        }else if(N/100 == 0){
            System.out.println(9);
        //3桁
        }else if(N/1000 == 0){
            System.out.println(N%1000-99+9);
        //4桁
        }else if(N/10000 == 0){
            System.out.println(909);
        //5桁
        }else if(N/100000 == 0){
            System.out.println(N%100000-9999+900+9);
        //100000
        }else{
            System.out.println(90909);
        }
    }
}
