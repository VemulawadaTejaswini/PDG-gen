import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        ArrayList<String> param = new ArrayList<String>();
        
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            for (int h = 0; h < num; h++) {
                String input = sc.next();
                param.add(input);
            }
        }
        
        int fc = 0;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int h = 0; h < param.size(); h++) {
                
                if (Integer.parseInt(param.get(h)) == i) {
                    count++;
                }
            }
            if (count == 0) {
                fc++;
            }
        }
        
        System.out.println(fc);
    }
}
                    
            