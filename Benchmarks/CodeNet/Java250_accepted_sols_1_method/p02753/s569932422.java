import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char keep = line.charAt(0);
        int cnt = 0;


        for(int i = 1; i<line.length();i++){
            if(keep != line.charAt(i)){
                cnt++;
            }
            keep = line.charAt(i);
        }
        if(cnt!=0){
        System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}