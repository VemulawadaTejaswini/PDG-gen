import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total_holiday = sc.nextInt();
        int total_homework = sc.nextInt();
        int total = 0;
        
        for(int i = 0;i < total_homework;i++){
            total += sc.nextInt();
        }
        if(total_holiday >= total){
            System.out.println(total_holiday-total);
        }else{
            System.out.println(-1);
        }
    }
}