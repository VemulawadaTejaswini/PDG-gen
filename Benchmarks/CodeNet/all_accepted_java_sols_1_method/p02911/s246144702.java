import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int person = sc.nextInt();
        int point = sc.nextInt();
        int question = sc.nextInt();
        
        int[] personpoint = new int[person];
        
        for(int i = 0; i < person; i++){
            personpoint[i] = point - question;
        }
        
        for(int i = 0; i < question; i++){
            int answer = sc.nextInt() - 1;
            personpoint[answer]++;
        }
        
        for(int po: personpoint){
            if(po > 0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        
    }
}