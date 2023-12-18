import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("",0);
        int judge = Integer.parseInt(n[n.length-1]);
        String ans = "";
        if(judge == 3){
            ans = "bon";
        }else if(judge == 0 || judge == 1 || judge == 6 || judge == 8){
            ans = "pon";
        }else{
            ans = "hon";
        }
        System.out.println(ans);
    }
}