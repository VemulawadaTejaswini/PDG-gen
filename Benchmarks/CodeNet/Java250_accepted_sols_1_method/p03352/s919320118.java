import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double max = 0;

        if(X==1){
            System.out.println(1);
        }
        else{
            for(int i=1; i<40; i++){
                for(int j=2; j<=10; j++){
                    if(Math.pow(i, j)<=X){
                        max = Math.max(max, Math.pow(i, j));
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println((int)max);
        }
    }
}