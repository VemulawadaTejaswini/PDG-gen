import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.next();
        String[] ss = s.split("");
        int x = 0;
        int answer = 0;
        for(int i = 0;i<n;i++){
            if(ss[i].equals("D")){
                x--;
            }else{
                x++;
                answer = Math.max(answer,x);
            }
        }
        System.out.println(answer);
    }
}