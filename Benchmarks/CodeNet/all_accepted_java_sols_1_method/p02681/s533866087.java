import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.math.*;
class Main{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] S = new String[11]; S = scanner.nextLine().split("");
        String[] T = new String[11]; T = scanner.nextLine().split("");
        for(int i=0;i<S.length;i++){
            if(!(S[i].equals(T[i]))){
                System.out.println("No");
                break;
            }
            else{
                if(i==S.length-1){
                    System.out.println("Yes");
                }
            }
        }
    }

}