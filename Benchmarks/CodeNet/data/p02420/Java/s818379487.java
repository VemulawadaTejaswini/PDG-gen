import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String line = sc.next();
            if(line.equals("-")){
                break;
            }
            int n = sc.nextInt();
            for(int i = 0;i<n;i++){
                int s = sc.nextInt();
                String p_1 = line.substring(0,s);
                String p_2 = line.substring(s);
                line = p_1 + p_2;
            }
            System.out.println(line);
        }
    }
}
