import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a[] = new char[4];
        int sum = 0;
        for(int i=0; i<4; i++){
            a[i] = s.charAt(i);
            if(a[i]=='+'){
                sum += 1;
            }
            else{
                sum -= 1;
            }
        }
        System.out.println(sum);
    }
}