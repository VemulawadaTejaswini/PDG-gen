import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,s;
        String g;
        while(true){
            s=0;  
            g = sc.next();
            //g = String.valueOf(n);
            k = g.length();
            if(k==1&&Integer.parseInt(g)==0){
                break;
            }
            for(int i=0;i<k;i++){
                s = s + Character.getNumericValue(g.charAt(i));
            }
            System.out.println(s);
        }
        sc.close();
    }
}
