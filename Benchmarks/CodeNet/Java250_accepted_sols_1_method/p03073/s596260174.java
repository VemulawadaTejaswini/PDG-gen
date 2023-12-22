import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] array = input.split("");
        
        int count = 0;
        
        if ("0".equals(array[0])) {
            
            for (int i = 1; i < array.length; i++) {
                
                if (array[i].equals("0") && "0".equals(array[i - 1])) {
                    
                    array[i] = "1";
                    count++;
                }
                
                if ("1".equals(array[i]) && "1".equals(array[i - 1])) {
                    
                    array[i] = "0";
                    count++;
                }
            }
        }
        
        if (array[0].equals("1")) {
            
            for (int i = 1; i < array.length; i++) {
                
                if ("1".equals(array[i]) && "1".equals(array[i - 1])) {
                    
                    array[i] = "0";
                    count++;
                }
                
                if ("0".equals(array[i]) && "0".equals(array[i - 1])) {
                    
                    array[i] = "1";
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
    
}
