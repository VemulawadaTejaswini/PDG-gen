import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String C = sc.next();

        int R = 0;
        int W = 0;
        String[] colors = new String[C.length()];
        for(int i = 0 ; i < C.length() ; i++){
            colors[i] = String.valueOf(C.charAt(i));
            if(colors[i].equals("R")){
                R++;
            }
            else{
                W++;
            }
        }
        sc.close();
        
        int p = 0;
        for(int i = 0 ; i < R ; i++){
            if(colors[i].equals("W"))
            p++;
        }

        System.out.println(p);

    }
}