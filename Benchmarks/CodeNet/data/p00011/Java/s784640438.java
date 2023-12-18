import java.util.Scanner;

public class Main {
    public static void main(String... args){
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int n = scan.nextInt();

        int list[] = new int[w];
        for(int i = 0;i < w;i++)list[i] = i+1;
        
        for(int i = 0;i < n;i++){
            String s = scan.next();
            int conma = s.indexOf(",");
            int a1 = Integer.parseInt(s.substring(0, conma))-1;
            int a2 = Integer.parseInt(s.substring(conma+1, s.length()))-1;
            int x = list[a1];
            list[a1] = list[a2];
            list[a2] = x;
        }
 
        for(int i = 0;i < w;i++)System.out.println(list[i]);

        scan.close();
    }

    

}
