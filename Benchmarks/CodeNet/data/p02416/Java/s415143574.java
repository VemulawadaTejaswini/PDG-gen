import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String x = scanner.nextLine();
        while(!x.equals("0")){
            char ch[] = x.toCharArray();
            int sum = 0;
            for(int i=0; i < x.length(); i++){
                sum += Character.getNumericValue(ch[i]);
            }
            System.out.println(sum);
            
            x = scanner.nextLine();
        }
    }
}
