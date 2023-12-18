import java.util.Scanner;

class Main{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int index,i;
        int temp;
        int min = 0;
        int max = 0;
        long sum = 0;
        
        i = 0;
        
        index = scanner.nextInt();
        temp = scanner.nextInt();
        
        min = temp;
        max = temp;
        sum += temp;
        i++;
        
        while(i < index){
            
            temp = scanner.nextInt();
            
            if(temp < min){
                min = temp;
            }
            if(temp > max){
                max = temp;
            }
            
            sum += temp;
            i++;    
        }
        System.out.println(min + " " + max + " " + sum);
    }
}
