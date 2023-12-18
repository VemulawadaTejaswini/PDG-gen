import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int[] kukan = new int[10];
            String line;
            try{
                line = sc.nextLine();
            }catch(Exception e) {
                break;
            }
            int all = 0;
            String[] linesp = line.split(",");
            for(int i = 0; i < 10; i++) {
                kukan[i] = Integer.parseInt(linesp[i]);
                all += Integer.parseInt(linesp[i]);
                
            }
            int a = Integer.parseInt(linesp[10]);
            int b = Integer.parseInt(linesp[11]);
            //すれ違うポイント
            double point = (double)(1000 * a * all / (a+b));
            point /= 1000;

            for(int i = 0; i < 10; i++) {
                point -= kukan[i];
                if(point <= 0) {
                    System.out.println(i+1);   
                    break;
                }
            }
            
        }
    }    
}

