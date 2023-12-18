import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        
        for(int x = a; x <= b; x++){
            if(c % x == 0){
                sum ++;
            }else{
                continue;
            }
        }
        System.out.println(sum);
    }
}
