import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int test=in.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        for (int i = 0; i < test; i++) {
            int a,b = 0;
            a=in.nextInt();
            if(a!=2){
              b=in.nextInt();  
            }
            if(a==0){
                ar.add(b);
            }
            else if(a==2){
                ar.remove((ar.size()-1));
            }
            else{
                System.out.println(ar.get(b));
            }
        }
    }
}
