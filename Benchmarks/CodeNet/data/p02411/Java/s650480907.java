import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a == -1 && b == -1 && c == -1) break;
            
            int sum = a + b;
            
            char grade;
            
            if(a == -1 || b == -1){
                grade = 'F';
            }else if(sum >= 80){
                grade = 'A';
            }else if(sum >= 65 && sum < 80){
                grade = 'B';
            }else if(sum >= 50 && sum < 65){
                grade = 'C';
            }else if(sum >= 30 && sum < 50){
                if(c >= 50){
                    grade = 'C';
                }else{
                    grade = 'D';
                }
            }else{
                grade = 'F';
            }
            System.out.println(grade);
            
        }
    }
}
