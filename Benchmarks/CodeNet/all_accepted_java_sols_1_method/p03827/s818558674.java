import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        int ans = 0;
        String lung = sc.next();
        String[] test = lung.split("");

        for(int i=0; i<num; i++){
            if(test[i].equals("I")){
                ans++;
            }else if(test[i].equals("D")){
                ans--;
            }
            if(answer < ans)
                answer = ans;
        }
        System.out.println(answer);
    }
}