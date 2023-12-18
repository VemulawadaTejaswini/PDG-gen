import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split("");
        String[] b = sc.nextLine().split("");
        String answer = "";
        for(int i = 0;i<a.length;i++){
            answer = answer + a[i];
            if(a.length>b.length && i == a.length-1){
                break;
            }
            answer = answer + b[i];
        }
        System.out.println(answer);
    }
}